package baekjoon.문자열;

import java.util.Scanner;

public class baekjoon10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        String[] ary = str.split("");
        for(int i = 0; i<ary.length; i++)
        {
            if(ary[i].equals("a")||ary[i].equals("e")||ary[i].equals("i")||ary[i].equals("o")||ary[i].equals("u"))
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
