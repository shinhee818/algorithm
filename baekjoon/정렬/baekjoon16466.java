package baekjoon.정렬;

import java.util.Arrays;
import java.util.Scanner;

public class baekjoon16466 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int [] ary = new int[k];

        for(int i= 0;i<k; i++){
            int l = scanner.nextInt();
            ary[i] = l;

        }
        Arrays.sort(ary);
        int count = 0;
        for(int y = 0; y<k ; y++){
            if(ary[y] != y+1){
                System.out.println(y+1);
                count++;
                break;
            }
        }
        if(count == 0){
            System.out.println(k+1);
        }

    }
    
}
