package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String reverse = sc.nextLine();
            if(reverse.equals("END"))
            {
                break;
            }
            StringBuilder sb = new StringBuilder(reverse);
            System.out.println(sb.reverse());

        }
    }
}
