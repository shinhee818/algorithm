package baekjoon.구현;


import java.util.Scanner;

public class baekjoon25304 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for(int i = 0; i<k ;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            count = count + x*y;
        }
        if( n== count){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
}
