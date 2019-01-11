import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        first();
    }

    public static void first() {
        //用于随机
        Random random = new Random();
        //用于构建字符串，因为stringBuilder比string+更省内存，不用形成新的字符串
        StringBuilder stringBuilder = new StringBuilder();
        //循环100次
        for (int i = 0; i < 100; i++) {
            //循环6次
            for (int j = 0; j < 6; j++) {
                if (j < 3) {
                    //随机数字
                    stringBuilder.append(random.nextInt(10));
                } else {
                    //随机大写字母
                    stringBuilder.append((char) (random.nextInt(26) + 65));
                }
            }
            //换行
            stringBuilder.append('\n');
        }
        
        //输出stream
        FileOutputStream fileOutputStream;
        try {
            //创建文件
            fileOutputStream = new FileOutputStream("C:/Users/宁鹏/Desktop/Password.txt");
            //转为二进制写入文件
            fileOutputStream.write(stringBuilder.toString().getBytes());
            //刷新关闭
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}