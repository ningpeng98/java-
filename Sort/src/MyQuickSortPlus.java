import java.util.Arrays;
import java.util.Random;
/***
 * 快速排序(递归写法的优化)：
 * 快速排序越往后越有序，根据直接插入排序越有序越快的特性，可以规定在小于某一区间时使用直接插入排序
 * 时间复杂度：O(nlog2n)
 * 空间复杂度：log2n
 * 稳定性：不稳定
 */

public class MyQuickSortPlus {
    public static void main(String[] args) {
        int[] arr =new int[1000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1000)+1;
        }
        MyQuickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //快速排序
    public static void  MyQuickSort(int[] arr){
        quick(arr,0,arr.length-1);

    }

    public static void swap(int[] arr,int low,int high){
        int tmp = arr[low];
        arr[low] = arr[high];
        arr[high] = tmp;
    }

    public static void medianOfThree(int[] arr,int low,int high){
        int mid = (low+high)>>>1;
        //arr[mid]<=arr[low]<=arr[high]

        //确保arr[mid]<=arr[low]
        if(arr[mid]>arr[low]){
            swap(arr,low,mid);
        }
        //确保arr[mid]<=arr[high]
        if(arr[mid]>arr[high]){
            swap(arr,mid,high);
        }
        //确保arr[low]<=arr[high]
        if(arr[low]>arr[high]){
            swap(arr,low,high);
        }


    }

    public static void quick(int[] arr,int low,int high){
        if(low == high){
            return;
        }
        //先三数取中，再找基准
        medianOfThree(arr,low,high);
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

