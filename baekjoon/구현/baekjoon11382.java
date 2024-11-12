package baekjoon.구현;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class baekjoon11382 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long k =0;
        for(int i =0; i<3;i++){
            k+=sc.nextLong();

        }
        System.out.println(k);
    }
    
}
