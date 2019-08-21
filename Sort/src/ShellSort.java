import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5,2,-6,8,-3,9,7,4,1,0,-5,3,6};
        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        ShellSort(arr);
        System.out.println("ShellSort-排序后：");
        System.out.println(Arrays.toString(arr));
    }
/*    public static void ShellSort(int[] arr){
        //设置分组，第一次为n/2组
        int gap = arr.length/2;
        while(gap>=1){
            for(int i = gap;i<arr.length;i++){
                int tmp = arr[i];
                //各组已排序区间第一个元素位置为i-gap
                int j = i-gap;
                //arr[j]为已排序区间与待插入元素对比的元素，
                //j-=gap:由于希尔排序是间隔进行对比，所以每个待对比元素位置之间间隔为gap
                while(j>=0 && arr[j]>tmp){
                    arr[j+gap] = arr[j];
                    j=j-gap;
                }
                arr[j+gap] = tmp;
            }
            gap = gap/2;
        }
    }*/

    public static void ShellSort(int[] arr){
        //设置分组，第一次为n/2组
        int gap = arr.length/2;
        while(gap>=1){
            for(int i = gap;i<arr.length;i++){
                int tmp = arr[i];
                //各组已排序区间第一个元素位置为i-gap
                int j = i-gap;
                //arr[j]为已排序区间与待插入元素对比的元素，
                //j-=gap:由于希尔排序是间隔进行对比，所以每个待对比元素位置之间间隔为gap
                for(;j>=0;j-=gap){
                    //若已排序区间元素大于tmp,进行交换
                    if(arr[j]>tmp){
                        arr[j+gap] = arr[j];
                    }else{
                        break;
                    }
                }
                arr[j+gap] = tmp;
            }
            gap = gap/2;
        }
    }
}
