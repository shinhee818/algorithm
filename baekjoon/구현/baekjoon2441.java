package baekjoon.구현;

import java.util.Scanner;

public class baekjoon2441 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        for(int i = k; i>0;i--){
            System.out.println("*".repeat(i));
        }
    }
    
}
