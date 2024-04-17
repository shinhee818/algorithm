package baekjoon.정렬;

import java.util.Collections;
import java.util.*;
public class baekjoon5576 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer [] wstr = new Integer[10];
        Integer [] kstr = new Integer[10];
        int w =0;
        int k =0;
        for(int i=0; i<10; i++){
            wstr[i]=sc.nextInt();
        
        }
        for(int i=0; i<10; i++){
            kstr[i]=sc.nextInt();
        
        }
        Arrays.sort(wstr,Collections.reverseOrder());
        Arrays.sort(kstr,Collections.reverseOrder());

        for(int i = 0; i<3; i++){
    
            w += wstr[i];
            k += kstr[i];

        }
        System.out.print(w + " " +k);
    }
    
}
