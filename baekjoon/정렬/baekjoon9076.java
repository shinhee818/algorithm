package baekjoon.정렬;

import java.util.*;

public class baekjoon9076 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Integer [] ary = new Integer[5];
        for(int i=0; i< t;i++){
            for(int k=0; k<5; k++){
                ary[k] = sc.nextInt();
            }
            Arrays.sort(ary);
            if(ary[3]-ary[1]>=4){
                System.out.println("KIN");
            }else{
                System.out.println(ary[3]+ary[2]+ary[1]);
            }

        }
    }
    
}
