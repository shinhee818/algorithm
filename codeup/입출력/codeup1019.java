package codeup.입출력;

import java.util.Scanner;

public class codeup1019 {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).next().split("\\.");
        System.out.printf("%d.%02d.%02d", Integer.parseInt(str[0]), Integer.parseInt(str[1]), Integer.parseInt(str[2]));
    }
}
