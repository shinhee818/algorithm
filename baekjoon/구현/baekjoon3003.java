package baekjoon.구현;


import java.util.Scanner;

public class baekjoon3003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = 1;
        int q = 1;
        int l = 2;
        int b = 2;
        int n = 2;
        int p = 8;
        int[] arr = new int[6];
        for(int i= 0 ; i<6 ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println((k - arr[0]) + " " + (q - arr[1]) + " " + (l - arr[2]) + " " + (b-arr[3]) + " "+
        (n - arr[4]) + " " + (p - arr[5]));

    }
    
}
