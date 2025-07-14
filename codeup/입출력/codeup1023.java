package codeup.입출력;

import java.util.Scanner;

public class codeup1023 {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split("\\.");
        System.out.printf("%d\n%d", Integer.parseInt(str[0]), Integer.parseInt(str[1]));

    }
}
