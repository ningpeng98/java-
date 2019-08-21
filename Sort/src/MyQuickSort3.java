import java.util.Arrays;
import java.util.Random;
/***
 * 快速排序(非递归)：
 * 快速排序越往后越有序，根据直接插入排序越有序越快的特性，可以规定在小于某一区间时使用直接插入排序
 * 时间复杂度：O(nlog2n)
 * 空间复杂度：log2n
 * 稳定性：不稳定
 */

public class MyQuickSort3 {
    public static void main(String[] args) {
        int[] arr =new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        System.out.println("原数组为：\n"+Arrays.toString(arr));
        MyQuickSort(arr);
        System.out.println("（非递归）快速排序后的数组为：\n"+Arrays.toString(arr));
        //判断，若最终结果不是有序，则打印false
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("false!");
            }
        }
    }
    //快速排序(非递归)
    public static void  MyQuickSort(int[] arr){
        int[] stack = new int[arr.length*2];
        int top = 0;
        int low = 0;
        int high = arr.length-1;
        //先进行一趟快速排序
        int par = partion(arr,low,high);

        //1.判断当前par左右两边是否有两个以上数据
        if(par>low+1){
            stack[top++] = low;
            stack[top++] = par-1;
        }
        if(par<high-1){
            stack[top++] = par+1;
            stack[top++] = high;
        }
        //以上代码执行完毕，以上数对已经全部入栈
        //判断栈是否为空，不为空时取出两个数对，进行partion();
        while(top>0){
            //出栈
            high = stack[--top];
            low = stack[--top];
            par = partion(arr,low,high);
            if(par>low+1){
                stack[top++] = low;
                stack[top++] = par-1;
            }
            if(par<high-1){
                stack[top++] = par+1;
                stack[top++] = high;
            }
        }

    }
    //找基准
    public static int partion(int[] arr,int low,int high){
        int tmp = arr[low];
        while(low<high){
            while((low<high)&&arr[high]>=tmp){
                high--;
            }
            if(low==high){

                break;
            }else{
                arr[low] = arr[high];
            }

            while((low<high)&&arr[low]<=tmp){
                low++;
            }
            if(low==high){
                break;
            }else{
                arr[high] = arr[low];
            }
        }
        arr[low] = tmp;
        //或：arr[high] = tmp;
        return low;
    }
}

