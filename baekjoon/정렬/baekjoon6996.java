package baekjoon.정렬;

import java.util.Arrays;
import java.util.*;


public class baekjoon6996 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i =0; i<n;i++){
            String str = sc.next();
            String str2 = sc.next();
            String [] strary = str.split("");
            String [] str2ary = str2.split("");
            Arrays.sort(strary);
            Arrays.sort(str2ary);
            System.out.println(Arrays.toString(strary) + " "+Arrays.toString(str2ary));
          
            if(Arrays.toString(strary).equals(Arrays.toString(str2ary))){
                System.out.println(str +" & "+str2+" "+"are anagrams.");
            }else{
                System.out.println(str +" & "+str2+" "+"are"+" " +"NOT anagrams.");

            }
            
        }

    }
    
}
