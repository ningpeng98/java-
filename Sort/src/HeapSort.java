import java.util.Arrays;
/***
 * 堆排序
 * 时间复杂度：O(nlog2n)
 * 空间复杂度：O(1)
 * 稳定性：不稳定
 */

public class HeapSort {
    public static void main(String[] args){
        int[] arr = {5,2,-6,8,-3,9,7,4,1,0,-5,3,6};

        System.out.println("排序前：");
        System.out.println(Arrays.toString(arr));
        MyHeapSort(arr);
        System.out.println("MyHeapSort排序后：");
        System.out.println(Arrays.toString(arr));

    }

    public static void MyHeapSort(int[] arr){
        //每棵小子树
        for (int i = (arr.length-1-1)/2; i >=0 ; i--) {
            //每次调整函数
            adjust(arr,i,arr.length-1);
        }
        //以上for循环结束后，整棵树已全部变为大根堆
        for (int j = 0; j <= arr.length-1 ; j++) {
            int tmp = arr[0];
            arr[0] = arr[arr.length-1-j];
            arr[arr.length-1-j] = tmp;
            adjust(arr,0,arr.length-1-j-1);
            //最后-1是因为最后面的值已经是最大值，相当于已排序区间，不算做下一次调整的

        }
    }


    //一次调整函数，负责把每一棵子树调整为大根堆
    public static void adjust(int[] arr,int start,int end){
        int tmp = arr[start];
        //i=2*i+1在孩子节点中有比父亲节点的值大时，进入孩子节点，重新建堆，将最大的孩子节点提升到父亲节点的位置
        for (int i = 2*start+1; i <= end; i = 2*i+1) {
            //找到最大子树，若2*start+1不是最大值，则2*start+2就是最大值
            if((i<end) && (arr[i]<arr[i+1])){
                i++;//最大值的下标
            }
            //若最大子树大于父亲节点，则将父亲节点的值更改为最大子树的值,且将原本最大子树的索引交给start
            //否则说明父亲节点就是这个二叉树中的最大值，无序改变，退出循环
            if(arr[i]>tmp){
                arr[start] = arr[i];
                start = i;
            }else if (arr[i]<tmp){

                break;
            }

        }
        //将原本父亲节点的值放到原来最大子节点的索引处
        arr[start] = tmp;
    }

}



