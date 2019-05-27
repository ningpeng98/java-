package Day6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //ab1=A-B;bc1=B-C;ab2=A+B;bc2=B+C;
        int ab1=sc.nextInt();
        int bc1=sc.nextInt();
        int ab2=sc.nextInt();
        int bc2=sc.nextInt();
        for(int A=0;A<=30;A++){
            for(int B=0;B<=30;B++){
                for (int C=0;C<=30;C++){
                    if(A-B==ab1){
                        if (B-C==bc1){
                            if(A+B==ab2){
                                if(B+C==bc2){
                                    System.out.println(A+" "+B+" "+C);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("No");
    }
}
