package baekjoon.정렬;

import java.util.*;

public class baekjoon25305 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer [] array = new Integer[n];
        for(int i = 0; i<n ; i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array,Collections.reverseOrder());
        System.out.print(array[k-1]);

    }
    
}
