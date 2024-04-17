package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1264 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        while(true){
            String s = br.readLine().toLowerCase();
            if( s.equals("#") ){
                break;

            }else{
                for(int i =0;i<s.length();i++){
                    if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i'|| s.charAt(i) == 'o' || s.charAt(i) =='u' ){
                        c++;
                    }
                }
                System.out.println(c);
                c = 0;

            }



        }
    }
    
}
