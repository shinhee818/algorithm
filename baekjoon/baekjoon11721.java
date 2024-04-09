package baekjoon;

import java.util.Scanner;

public class baekjoon11721 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.print(c);
            if(i % 10 == 9){
                System.out.println();
            }
            
        
        }
    }
}
