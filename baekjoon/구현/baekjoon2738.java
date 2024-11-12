package baekjoon.구현;

import java.util.Scanner;

public class baekjoon2738 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String [] str = new String[4];
        int c = 0;
        for(int i = 0; i<3 ; i++){
            c=0;
            for (int k = 0; k<4; k++){
                str[k] = sc.next();
            }
            for(int k = 0; k<4; k++){
                
                if(str[k].equals("0")){
                    c+=1;
                }
            }
            if(c == 0){
                System.out.println("E");
            }else if(c==1){
                System.out.println("A");
            }else if(c==2){
                System.out.println("B");
            }else if(c==3){
                System.out.println("C");
            }else if(c==4){
                System.out.println("D");
            }
            

        }
        
    }
    
}
