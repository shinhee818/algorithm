package baekjoon.자료구조;

import java.util.HashMap;
import java.util.Scanner;

public class baekjoon27160 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<n;i++){
            String str = scanner.next();
            int k = scanner.nextInt();
            if(map.containsKey(str)){
                int val = map.get(str);
                k = val+k;
                map.put(str,k);
            }else{
                map.put(str,k);
            }
        }
        if(map.containsValue(5)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
    
}
