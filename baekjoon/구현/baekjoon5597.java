package baekjoon.구현;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon5597 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[30];
        for(int i=0; i<28; i++){
            int n = sc.nextInt();
            arr[n-1]=1;
        }
        for(int k=0;k<30;k++){
            if(arr[k]!= 1){
                System.out.println(k+1);
            }

        }
    }

}
