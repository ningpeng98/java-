package Day20;
//牛客#微信红包
public class Gift {
    public int getValue(int[] gifts, int n) {
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=n-1;j>=0;j--){
                if(gifts[i]==gifts[j]){
                    count++;
                }
            }
            if(count>(n/2)){
                return gifts[i];
            }
        }
        return 0;
    }
}
