package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon10798 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str [][] = new String[5][5];
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                str[i][j] = scanner.next();
            }
        }
        System.out.print(str);
    }
    
}
