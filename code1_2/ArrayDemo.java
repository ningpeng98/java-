public class ArrayDemo{
    public static void main(String[] args){
        int[] dataA=new int[]{1,2,3,4,5,6,7,8,9};
        int[] dataB=new int[]{11,22,33,44,55,66,77,88,99};
        System.arraycopy(dataB,7,dataA,3,2);
        printArray(dataA);
    }
    public static void printArray(int[] temp){
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }
        System.out.println();
    }
}