import java.util.Arrays;
/**
 * 二分（折半）插入排序：
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 * */
public class InsertSort {
    public static void main(String[] args){
        int[] arr = {5,2,-6,8,-3,9,7,4,1,0,-5,3,6};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        MyBinaryInsertSort(arr);
        System.out.println("MyInsertSort-排序后：");
        System.out.println(Arrays.toString(arr));
    }

    public static void MyBinaryInsertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int low = 0;
            int high = i-1;
            int tmp = arr[i];
            int mid = 0;
            int j = i-1;
            while(low<=high){
                mid = (low+high)/2;
                if(tmp>arr[mid]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
            for(;j>high;j--){
                arr[j+1] = arr[j];

            }
            arr[j+1] = tmp;
        }
    }
    public static void MyInsertSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i-1;
            for (; j >=0; j--) {
                if(tmp <arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }
}
