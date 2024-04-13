package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon1157 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String n = "";
        for(int i=0; i< t; i++){
            int k = scanner.nextInt();
            String [] str = scanner.nextLine().split("");
            for(String  s: str){
                n += s.repeat(k);
            }
            System.out.println(n.trim());
            n = "";
        }
    }

}
