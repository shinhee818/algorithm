package baekjoon.문자열;
import java.util.Scanner;

public class baekjoon10988 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        StringBuilder sb = new StringBuilder(str);
        int k =1;
        sb.reverse();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=sb.charAt(i)){
                k = 0;
            }
        }
        System.out.println(k);
    }

}
    

