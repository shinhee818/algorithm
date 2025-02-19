package baekjoon.구현;

import java.util.Scanner;

public class baekjoon1009 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = 1;

            for(int j=0; j<b; j++){
                k = (k*a)%10;
            }
            if(k==0){
                System.out.println("10");
            }else System.out.println(k);

        }
    }
}
