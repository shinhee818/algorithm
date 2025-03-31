package baekjoon.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon28417 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[2];
        int [] arr2 = new int[5];

        int score =0;
        int result = 0;

        for(int i=0; i<n; i++){

            for(int j=0;j<2;j++){
              arr[j] = sc.nextInt();
            }
            for(int a = 0; a<5;a++){
                arr[a] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(arr2);
            score = arr[1]+arr2[3] + arr2[4];
            result= Math.max(score,result);

        }
        System.out.println(result);
    }
}
