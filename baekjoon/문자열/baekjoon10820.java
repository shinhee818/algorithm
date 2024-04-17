package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10820 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str = br.readLine()) != null){
            int upper = 0;
            int lower = 0;
            int space =0 ;
            int i = 0;
            char [] chararray = str.toCharArray();
            for(char c : chararray){
                if(c>= 65 && c<=90){
                    upper ++;
    
                }else if(c>=97 && c<=122){
                    lower ++;
                }else if(c == ' '){
                    space ++;
                }else{
                    i++;
    
                }
            }
            System.out.println(lower + " " + upper + " " + i + " " + space);   
        }
    }  
}
