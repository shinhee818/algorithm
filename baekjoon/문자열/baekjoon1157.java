package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon1157 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().toUpperCase();
        int n [] = new int[26];
        char ct = 0;
        int max = -3;
        for(char ch:s.toCharArray()){
            n[ch - 'A']++;
        }
        for(int i =0 ; i<26;i++){
            if(max<n[i]){
                max=n[i];
                System.out.println(n[i]);
                ct=(char)(i+65);
            }else if(max == n[i]){
                System.out.print("?");
                return ;

            }
        }
        System.out.println(ct);
    }

}
