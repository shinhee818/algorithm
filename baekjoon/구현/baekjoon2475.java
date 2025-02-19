package baekjoon.구현;

import java.util.Scanner;

public class baekjoon2475 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i=0; i<5; i++){
            int k = sc.nextInt();
            count+= k*k;


        }
        System.out.println(count%10);

        
    }
    
}
