package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon1100 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [][] str = new String[8][8];
        int c = 0;
        for(int i=0;i<str.length;i++){
            String s = scanner.nextLine();
            for(int k =0 ;k<str[i].length;k++){
                if(i % 2 ==0){
                    if(k%2==0){
                        if(s.charAt(k) == 'F') c++;
                    }
                }
                else{
                    if(k % 2 != 0){
                        if(s.charAt(k)=='F') c++;
                    }
                }
               
            }
        }
       
     
        System.out.println(c);
    }
    
}
