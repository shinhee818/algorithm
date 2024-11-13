package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon1357 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int xReverse = 0;
        int yReverse = 0;

        int plusReverse = 0;
        while (x!=0){
            xReverse  = xReverse *10 + x % 10;
            x/=10;
        }
        while (y!=0){
            yReverse = yReverse * 10 + y%10;
            y/=10;
        }
        int plus = xReverse + yReverse;

        while (plus!=0){
            plusReverse = plusReverse * 10 + plus%10;
            plus/=10;
        }
        System.out.println(plusReverse);

    }
    public static void Rev(int n){
        int reverse=0;
        while (n!=0){
            reverse = reverse * 10 + n%10;
            reverse/=10;
        }
    }
}
