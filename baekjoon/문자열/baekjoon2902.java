package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon2902 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String [] str = scanner.next().split("-");
        for(int i=0;i<str.length;i++){
            System.out.print(str[i].charAt(0));

        }
    }
    
}
