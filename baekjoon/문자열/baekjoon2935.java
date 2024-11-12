package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class baekjoon2935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger k = new BigInteger(br.readLine());
        String s = br.readLine();
        BigInteger t = new BigInteger(br.readLine());
        if(s.equals("*")){
            System.out.println(k.multiply(t));
        }else{
            System.out.println(k.add(t));
        }

    }
    
}
