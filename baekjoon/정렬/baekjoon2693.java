package baekjoon.정렬;

import java.util.*;

public class baekjoon2693 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i < t ; i++){
            Integer [] str = new Integer[10];
            for(int k =0; k<10 ; k++){
                str[k] = sc.nextInt();
            }
            Arrays.sort(str);
            System.out.println(str[7]);
        }
    }
    
}
