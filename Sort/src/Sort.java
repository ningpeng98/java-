import java.util.Arrays;



public class Sort {
    public static void main(String[] args){
        int[] arr = {5,2,-6,8,-3,9,7,4,1,0,-5,3,6};
        //MyBubbleSort(arr);
        //MySelectSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
 /*       MyInsertSort(arr);
        MyshellSort(arr);
        System.out.println(Arrays.toString(arr));*/
    }




    //冒泡排序
    public static void MyBubbleSort(int[] arr){
        System.out.println("MyBubbleSort:");
        if(arr.length<=1){
            return;
        }
        for(int i = arr.length-1;i > 0;i--){
            for(int j = 0;j < i;j++){
                if(arr[j]<arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;

                }
            }

        }

    }
    //选择排序
    public static void MySelectSort(int[] arr){
        System.out.println("MySelectSort:");
        if(arr.length<=1){
            return;
        }
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    //swap(arr[i],arr[j]);
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

    }

    /**
     * 直接插入排序
     * 时间复杂度：O(n^2)
     * 如果给定数据是有序的数据，那么时间复杂度就是O(n)
     * 直接插入排序，越有序越快
     * 稳定性：稳定
     *
     *
     * */
/*    public static void MyInsertSort(int[] arr){
        System.out.println("MyInsertSort:");
        if(arr.length<=1){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            int tmp = arr[i];
            int j = i-1;
            for(;j>=0;j--){
                if(tmp < arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }*/
    //折半插入排序
    public static void MyBinaryInsertionSort(int[] arr){

    }
    //希尔排序-插入排序的优化
    public static void MyshellSort(int[] arr,int gap){
        System.out.println("MyshellSort");
        if(arr.length<=1){
            return;
        }
        for (int i = gap;i<arr.length;i++){
            int tmp = arr[i];
            int j = i-gap;
            for(;j>=0;j=j-gap){
                if(tmp < arr[j]){
                    arr[j+gap] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+gap] = tmp;
        }

    }




}












/*    public static void bubbleSort(int[] array) {
        if (array.length <= 1) {
            return;
        }else {
            int n = array.length;
            for (int i = 0;i < n;i++) {
                for (int j = 0;j < n - i - 1;j++) {
                    if (array[j] > array[j+1]) {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
    }*/
