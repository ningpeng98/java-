import java.util.Arrays;
import java.util.Random;
/***
 * 快速排序(递归写法)优化：
 * 快速排序越往后越有序，根据直接插入排序越有序越快的特性，可以规定在小于某一区间时使用直接插入排序
 * 时间复杂度：O(nlog2n)
 * 空间复杂度：log2n
 * 稳定性：不稳定
 */

public class MyQuickSort2 {
    public static void main(String[] args) {
        int[] arr =new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        System.out.println("原数组为：\n"+Arrays.toString(arr));
        MyQuickSort(arr);
        System.out.println("（递归优化）快速排序后的数组为：\n"+Arrays.toString(arr));
        //判断，若最终结果不是有序，则打印false
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("false!");
            }
        }
    }
    //快速排序
    public static void  MyQuickSort(int[] arr){
        quick(arr,0,arr.length-1);

    }
    public static void insertSort(int[] arr,int low,int high){
        int tmp = 0;
        for(int i = low+1;i<=high;i++){
            tmp = arr[i];
            int j = i-1;
            for(;j>=low;j--){
                if(arr[j]>tmp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }

    public static void quick(int[] arr,int low,int high){
        if(low == high){
            return;
        }
        if(high-low+1<=15){
            insertSort(arr,low,high);
            return;
        }
        int par = partion(arr,low,high);
        //递归左边：保证左边有两个数据以上
        if(par>low+1){
            quick(arr,low,par-1);
        }
        //递归左边：保证左边有两个数据以上
        if(par<high-1){
            quick(arr,par+1,high);
        }
    }



    //找基准,基准两边已经有序
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

