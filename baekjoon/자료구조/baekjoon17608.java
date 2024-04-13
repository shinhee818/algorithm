package baekjoon.자료구조;

import java.util.Scanner;

public class baekjoon17608 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] intstr = new int[n];
        int s = 1;
        for(int i =0 ; i<n ;i++){
            intstr[i] = scanner.nextInt();
        }
        int max = intstr[n-1];

        for(int i=n-1;i>=0;i--){
            if(intstr[i]>max){
                max = intstr[i];
                s++;

            }
        }
        System.out.print(s);

    }
    
}
