package baekjoon.문자열;

import java.util.*;

public class baekjoon7567 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        int n = 10;
        for(int i = 1; i<str.length();i++){
            if(str.charAt(i-1)==str.charAt(i)){
                n += 5;

            }else{
                n+=10;
            }
            
            
            
        }
        
        System.out.print(n);
        

    }
    
}
