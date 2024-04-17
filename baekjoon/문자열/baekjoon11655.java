package baekjoon.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11655 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char [] charary = br.readLine().toCharArray();
        for (char c : charary){
            if(c<65){
                c = (char) c;
            }else if(90-c<13 && c<=90){
                c = (char)(64+13-(90-c));

            }else if(c>=97&&122-c<13){
                c = (char)(96+13-(122-c));
            }else if(c == ' '){
                c = ' ';
            }else{
                c = (char)(c+13);


            }
           
            System.out.print(c);

        }

        
    }    
}
