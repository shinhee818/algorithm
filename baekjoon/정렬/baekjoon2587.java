package baekjoon.정렬;

import java.util.*;

public class baekjoon2587 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] ary = new int[5];
        int sum = 0;
        for(int i= 0;i<5; i++){
            int k = scanner.nextInt();
            ary[i] = k;

        }
        Arrays.sort(ary);
        for(int a : ary){
            
            sum += a;
        }
        System.out.println(sum/5);
        System.out.println(ary[2]);
    }
    
}
