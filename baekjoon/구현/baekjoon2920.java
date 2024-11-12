package baekjoon.구현;

import java.util.*;

public class baekjoon2920 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int asstr [] = new int[8];
        int desstr [] = new int[8];
        int kstr[] = new int[8];
        
        for(int i=0;i<8;i++){
            int k = sc.nextInt();
            asstr[i] = k;
            desstr[i] = k;
            kstr[i] = k;
        }
        Arrays.sort(asstr);
        desstr = Arrays.stream(desstr).boxed().sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue).toArray();
        if(Arrays.equals(asstr, kstr)){
            System.out.println("ascending");
        }else if(Arrays.equals(desstr, kstr)){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
        

       
    }
    
}
