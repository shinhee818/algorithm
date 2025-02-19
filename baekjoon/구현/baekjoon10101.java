package baekjoon.구현;

import java.util.Scanner;

public class baekjoon10101 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        int r3 = sc.nextInt();
        if((r1+r2+r3)==180){
           if(r1==60){
               if(r2==60 || r3 ==60){
                   System.out.println("Equilateral");
               }
           }
        }


    }

}
