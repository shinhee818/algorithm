package baekjoon.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int s = Integer.parseInt(br.readLine());
        int [] ary = new int[s];

        for(int i=0;i<s;i++){
            int k = Integer.parseInt(br.readLine());
            ary[i] = k;
        }
        Arrays.sort(ary);
        for(int a : ary){
            sb.append(a).append("\n");
        }
        System.out.println(sb);
    }
    
}
