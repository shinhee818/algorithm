package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon9086 {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        String str[] = new String[k];


        for(int i = 0; i<k ; i++){
            str[i] = scanner.next();
        }
        for(int t=0; t< str.length;t++){
             System.out.print(str[t].charAt(0));
             System.out.println(str[t].charAt(str[t].length()-1));
        }
    }
    
}
