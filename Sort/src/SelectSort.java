import java.util.Arrays;
/**
 * 选择排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 * */
public class SelectSort {
    public static void main(String[] args){
        int[] arr = {5,2,-6,8,-3,9,7,4,1,0,-5,3,6};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        MySelectSort(arr);
        System.out.println("MySelectSor-排序后：");
        System.out.println(Arrays.toString(arr));
    }

    public static void MySelectSort(int[] arr){

        for(int i = arr.length-1;i>=0;i--){
            int maxIndex = i;
            for(int j = i-1;j>=0;j--){
                if(arr[j]>arr[maxIndex]){
                    maxIndex = j;
                }
            }
            int tmp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = tmp;
        }
    }
    //第二种
/*    public static void MySelectSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int minIndex = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int tmp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = tmp;
        }
    }*/
}
