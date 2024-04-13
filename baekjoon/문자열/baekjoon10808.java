package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon10808 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int [] intstr= new int[26];
        for(int i = 0; i<str.length();i++){
            char c= str.charAt(i);
            intstr[c-97]++;
        }
        for(int k=0; k<26;k++){
            System.out.print(intstr[k]+" ");
        }
    }

    
}
