//找出100-1000内所有水仙花数
public class Test {
    public static void main(String[] args) {
        for(int i = 100;i < 1000;i++) {
            if(isShuiXianHua(i)) {
                System.out.print(i+"、");
            }
        }
    }
    public static boolean isShuiXianHua(int num) {
        // 1.判断num是否是三位数
        if(num<100 && num > 1000) {
            return false;
        }else {
            // 2.将三位数拆分为个位，十位，百位
            // 123
            int gewei = num % 10;
            int shiwei = (num / 10) % 10;
            int baiwei = num / 100;
            int result = gewei*gewei*gewei+
                shiwei*shiwei*shiwei+baiwei*baiwei*baiwei;
            if(result == num) {
                return true;
            }else {
                return false;
            }
        }
    }
}