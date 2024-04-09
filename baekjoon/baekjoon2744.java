package baekjoon;

import java.util.Scanner;

public class baekjoon2744 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char [] str = scanner.next().toCharArray();
        for(char s: str){
            if(Character.isUpperCase(s)){
                char t = Character.toLowerCase(s);
                System.out.print(t);
            }else{
                char k = Character.toUpperCase(s);
                System.out.print(k);
            }
        }

    }
    
}
