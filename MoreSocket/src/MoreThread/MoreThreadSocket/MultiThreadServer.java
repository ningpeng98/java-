package MoreThread.MoreThreadSocket;

/**
 * 多线程聊天室的服务端
 *
 * */
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadServer {
    //保存所有连接的客户端
    private static Map<String,Socket> clientMap = new ConcurrentHashMap<>();
    private static class ExecuteClientMsg implements Runnable{
        private Socket client;

        public ExecuteClientMsg(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            Scanner in = null;
            try {
                in = new Scanner(client.getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
            while(true){
                if(in.hasNextLine()){
                    String msgFromClient = in.nextLine();
                    //用户注册流程
                    if(msgFromClient.startsWith("R")){
                        //R：用户名
                        String userNme = msgFromClient.split(":")[1];
                        try {
                            userReg(userNme,client);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    //P:私聊对象的用户名-发送的信息
                    if(msgFromClient.startsWith("P")){
                        //私聊流程
                        String  userName = msgFromClient.split(":")[1];
                        String msg = msgFromClient.split("-")[1];
                        try {
                            privateChat(userName,"私聊信息为："+msg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }

                    //G：msg
                    if(msgFromClient.startsWith("G")){
                        //群聊流程
                        String groupChatMsg = msgFromClient.split(":")[1];
                        try {
                            groupChat("群聊消息为："+groupChatMsg);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        /**
         * 私聊
         * */
        private void privateChat(String userName,String msg) throws IOException {
            Socket client = clientMap.get(userName);
            PrintStream out = new PrintStream(client.getOutputStream(),
                    true,"UTF-8");
            out.println(msg);
        }

        /**
         * 注册
         * */
        private void userReg(String userName,Socket client) throws IOException {
            clientMap.put(userName,client);
            System.out.println("当聊天室中共有"+clientMap.size()+"人");
            String msg = "用户"+userName+"已经上线！";
            System.out.println(msg);
            groupChat(msg);
        }

        /**
         * 群聊
         */
        private void groupChat(String msg) throws IOException {
            //获取map中的所有客户端，拿到他们的输出流
            Collection<Socket> sockets = clientMap.values();
            for(Socket client:sockets){
                PrintStream out = new PrintStream
                        (client.getOutputStream(),true,"UTF-8");
                out.println(msg);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(6666);
        ExecutorService service = Executors.newFixedThreadPool(20);
        for (int i = 0; i < 20; i++) {
            System.out.println("等待客户端连接...");
            Socket client = serverSocket.accept();
            System.out.println("有新的连接，端口号为："+client.getPort());
            //新建一个线程处理客户端的了解
            service.submit(new ExecuteClientMsg(client));
        }
        serverSocket.close();
    }
}
