/*
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<List<Integer>> result = null;
        while(in.hasNext()){
            int  input = in.nextInt();
            int[] arr = new int[input];
            for(int i = 0;i<input;i++){
                arr[i] = i+1;
            }
            //i代表被拆多少分，如一个数字4最少可拆分成两个，最少4个
            for(int j = 2;j<=input;j++){
               result = subArr(arr,input,j,0);
            }
            System.out.println(result);
        }
    }
    public static ArrayList<List<Integer>> subArr(int[] arr,int input,int j,int index){

        ArrayList<List<Integer>> MyList = new ArrayList<>();

        //分两组的情况
        if (j == 2) {
            int n1 = 1, n2 = input-1;
            while (n1<=n2) {
                if (arr[n1]+arr[n2] == input) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[n1]);
                    temp.add(arr[n2]);
                    MyList.add(temp);
                    n1++;
                    n2--;
                } else if (arr[n1]+arr[n2]<input)
                    n1++;
                else
                    n2--;
            }
            //若住宿费
        } else {
            for (int i = index; i < arr.length+ 1; i++) {
                ArrayList<List<Integer>> temp = subArr(arr, input - arr[i], j - 1, i + 1);
                // 若是有值返回则将该数塞入，无则不进行任何操作
                if (temp != null && temp.size() > 0) {
                    for (List<Integer> list : temp) {
                        list.add(arr[i]); // 将满足条件数值塞入
                    }
                    MyList.addAll(temp);
                }
            }
        }
        return MyList;
    }
}



*/


import java.util.Scanner;
import java.util.Stack;

public class Test {
    Stack<Integer> stack = new Stack<>();
    int top = 0;
    int total = 0;
    int n;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int  input = in.nextInt();
            int[] arr = new int[input];
            for(int i = 0;i<input;i++){
                arr[i] = i+1;
            }

         }
    }
}







