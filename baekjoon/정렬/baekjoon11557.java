package baekjoon.정렬;

import java.util.*;

public class baekjoon11557 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String, Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i<t ; i++){
            int k = sc.nextInt();
            for(int s =0;s<k ; s++){
                map.put(sc.next(),sc.nextInt());

            }
            Integer maxValue = Collections.max(map.values());
            for(Map.Entry<String,Integer> entry : map.entrySet()){
                Integer value = entry.getValue();
                String key = entry.getKey();
                if(value == maxValue){
                    System.out.println(key);
                }
            }
            
            

        }
    }
    
}
