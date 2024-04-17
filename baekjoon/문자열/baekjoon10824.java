package baekjoon.문자열;

import java.io.*;
import java.util.*;

public class baekjoon10824 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();
        String s4 = st.nextToken();
        String s5 = (s+s2);
        String s6 = s3+s4;
        System.out.println(Long.parseLong(s5)+Long.parseLong(s6));
    }
    
}
