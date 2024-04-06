package baekjoon;

import java.util.Scanner;

public class baekjoon2675 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        for(int k = 0; k<i;k++){
            int t = scanner.nextInt();
            String str = scanner.next();
            for(int s = 0; s<str.length(); s++){
                for(int y =0; y<t;y++){
                    System.out.print(str.charAt(s));
                }
            }
            System.out.println();  
        }
    }   
}
