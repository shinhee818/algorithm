package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon4999 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = scanner.nextLine();
        if(str.length()>=str2.length()){
            System.out.println("go");

        }else{
            System.out.println("no");
        }
    }
    
}
