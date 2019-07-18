package Day39;
//牛客#二维数组打印
import java.util.Arrays;

public class Main39_1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int n = 4;
        System.out.println(Arrays.toString(arrayPrint(arr,n)));
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        // write code here
        int sz= n*n;
        int[] arr2 = new int[sz];
        int i = 0;
        int arrx = 0;
        int arry = n-1;
        while(arrx<n){
            int x = arrx;
            int y = arry;
            while(x<n&&y<n){
                arr2[i]=arr[x][y];
                i++;
                x++;
                y++;
            }
            if(arry>0){
                arry--;
            }else{
                arrx++;
            }
        }
        return arr2;

    }
}
