package baekjoon.구현;

import java.util.Scanner;

public class baekjoon10872 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        for(int i=n;i>0;i--){
            k=k*i;
        }
        System.out.println(k);
    } 
    
}
