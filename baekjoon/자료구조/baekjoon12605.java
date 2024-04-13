package baekjoon.자료구조;

import java.util.Scanner;

public class baekjoon12605 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int index = 1;
        
        for(int i=0; i<n; i++){
            String [] str = scanner.nextLine().split(" ");
            System.out.print("Case #" + index + ": ");
            for(int k = str.length-1; k>=0;k--){
                System.out.print(str[k]+ " ");
            }
            System.out.println();
            index++;
            

        } 
    }


}
    

