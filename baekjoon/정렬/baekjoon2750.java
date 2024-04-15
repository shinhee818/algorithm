package baekjoon.정렬;

import java.util.*;

public class baekjoon2750 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int [] arr = new int[k];
        for(int i =0 ; i<k ; i++){
            int s = scanner.nextInt();
            arr[i]=s;
        }
        Arrays.sort(arr);
        for(int a : arr){
            System.out.println(a);
        }    

    }
   
    
}
