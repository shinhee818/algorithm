package baekjoon.구현;

import java.util.Scanner;

public class baekjoon10807 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[k];

        for(int i=0; i < k; i++){
            arr[i] = sc.nextInt();
        }
        int j = sc.nextInt();
        int x = 0;

        for (int y=0; y<k; y++){
            if(arr[y]==j){
                x++;
            }
        }
        System.out.println(x);
    }
}
