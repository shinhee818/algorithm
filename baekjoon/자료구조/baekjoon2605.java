package baekjoon.자료구조;

import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon2605 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int k = scanner.nextInt();
        for (int i=0;i<k;i++){
            int n = scanner.nextInt();
            if(n==0) {
                list.add(i+1);
            }else{
                list.add(list.size()-n,i+1);
            }
        }
        for(int i : list){
            System.out.print(i + " ");
        }

    }
    
}
