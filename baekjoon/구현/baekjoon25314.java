package baekjoon.구현;

import java.util.Scanner;

public class baekjoon25314 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String deci = "long int";
        if(k == 4){
            System.out.println(deci);
        }else{
            int t = (k - 4)/4;
            System.out.println("long ".repeat(t)+ deci);
        }

        
    }
    
}
