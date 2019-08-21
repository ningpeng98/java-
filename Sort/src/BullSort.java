import java.util.Arrays;
/**
 *冒泡排序
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 稳定性：稳定
 */
public class BullSort {
    public static void main(String[] args){
        int[] arr = {5,2,-6,8,-3,9,7,4,1,0,-5,3,6};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        MyBubbleSort(arr);
        System.out.println("排序后：");
        System.out.println(Arrays.toString(arr));

    }
    //优化
    public static void MyBubbleSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            boolean flag = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    flag = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            //若所有元素以有序，则跳出循环
            if(!flag){
                break;
            }

        }
    }
    //写法1
/*    public static void MyBubbleSort(int[] arr){
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
    }*/
    //写法二
/*    public static void MyBubbleSort(int[] arr){
        for(int i = arr.length-1;i>=0;i--){
            for (int j = 0; j < i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }

        }
    }*/

}
