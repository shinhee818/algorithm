package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str1 = br.readLine();
        String str2 = br.readLine();

        int a = Integer.parseInt(str);
        int b = Integer.parseInt(str1);
        int c = Integer.parseInt(str2);

        System.out.println(a+b-c);
        System.out.println(Integer.parseInt(str+str1)-Integer.parseInt(str2));


    }
}
