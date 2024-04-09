package baekjoon;

import java.util.Scanner;

public class baekjoon10953 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        for(int i=0; i< k; i++){
            String[] s = scanner.next().split(",");
            int t = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);

            
            System.out.println(t); 
        }
    }
    
}
