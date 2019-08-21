import java.util.Arrays;
import java.util.Random;
/***
 * 归并排序（递归）
 * 时间复杂度：O(nlog2n)
 * 空间复杂度：log2n
 * 稳定性：不稳定
 */

public class MyMergeSort {
    public static void main(String[] args) {
        int[] arr =new int[100];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100)+1;
        }
        System.out.println("原数组为：\n" + Arrays.toString(arr));
        MyMergeSort(arr, 0, arr.length - 1);
        System.out.println("归并排序后的数组为：\n" + Arrays.toString(arr));
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                System.out.println("false!");
            }
        }
    }

    public static void MyMergeSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        MyMergeSort(arr,low,mid);
        MyMergeSort(arr,mid+1,high);
        //分隔完成，已经变成一个一个有序的子序列
        //开始合并
        merge(arr,low,mid,high);
    }


    //合并函数
    public static void merge(int[] arr,int low,int mid,int high){
        int[] tmpArr = new int[arr.length];
        int tmpIndex= low;
        int low2 = mid+1;
        int i = low;
        //保证两个子序列中都有数据
        while(low<=mid && low2<=high){
            if(arr[low]<=arr[low2]){
                tmpArr[tmpIndex++] = arr[low++];
            }
            if(arr[low2]<=arr[low]){
                tmpArr[tmpIndex++] = arr[low2++];
            }
        }
        while(low<=mid){
            tmpArr[tmpIndex++] = arr[low++];
        }
        while(low2<=high){
            tmpArr[tmpIndex++] = arr[low2++];
        }

        while(i<=high){
            arr[i] = tmpArr[i];
            i++;
        }
    }
}
/*
    public static void MyMergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;

        MyMergeSort(arr,low,mid);
        MyMergeSort(arr,mid+1,high);

        merge(arr,low,high,mid);

    }
    public static void merge(int[] arr,int low,int high,int mid){
        int tmpArr[] = new int[arr.length];
        int tmpIndex = low;
        int low2 = mid+1;
        int i = low;
        while(low<=mid&&low2<=high){
            if(arr[low]<=arr[low2]){
                tmpArr[tmpIndex++] = arr[low++];
            }
            if(arr[low2]<=arr[low]){
                tmpArr[tmpIndex++] = arr[low2++];
            }
        }
        while(low<=mid){
            tmpArr[tmpIndex++] = arr[low++];
        }
        while(low2<=high){
            tmpArr[tmpIndex++] = arr[low2++];
        }
        while(i<=high){
            arr[i] = tmpArr[i];
            i++;
        }
    }
*/

