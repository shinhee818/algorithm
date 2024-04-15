package baekjoon.정렬;
import java.util.*;

public class baekjoon10817 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] ary = new int[3];
        for(int i =0; i<3 ; i++){
            int k = scanner.nextInt();
            ary[i] = k;
        }
        Arrays.sort(ary);
        System.out.println(ary[1]);
    }
    
}
