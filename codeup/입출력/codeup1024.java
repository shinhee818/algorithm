package codeup.입출력;

import java.util.Scanner;

public class codeup1024 {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split("");
        for(String s : str){
            System.out.printf("'%s'%n",s);
        }
    }
}
