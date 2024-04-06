package baekjoon;

import java.util.Scanner;

public class baekjoon10988 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int k = str.length() / 10;
        for(int i=1; i<k+1 ; i+=10){
            System.out.println(str.substring(i-1,i*10));
        }
        System.out.println(str.substring(k*10));



    }
}
