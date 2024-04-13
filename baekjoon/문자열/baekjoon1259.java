package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon1259 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean t = true;
        while(t){
            String str = scanner.nextLine();
            StringBuilder sb = new StringBuilder(str);
            String reverse = sb.reverse().toString();
            if(str.equals("0"))
            {
                break;
            }
            if(str.equals(reverse)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
