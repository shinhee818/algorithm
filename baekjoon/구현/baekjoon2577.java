package baekjoon.구현;


import java.util.Scanner;

public class baekjoon2577 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n =1;
        int [] num = new int[10];
        for(int i = 0; i<3;i++){
            long k = scanner.nextLong();
            n = n*k;
        }
        String s = String.valueOf(n);
        String [] str = s.split("");
        for(int i=0; i<str.length;i++){
            if(str[i].equals("0")){
                num[0]++;
            }else if(str[i].equals("1")){
                num[1]++;
            }else if(str[i].equals("2")){
                num[2]++;
            }else if(str[i].equals("3")){
                num[3]++;
            }else if(str[i].equals("4")){
                num[4]++;
            }else if(str[i].equals("5")){
                num[5]++;
            }else if(str[i].equals("6")){
                num[6]++;
            }else if(str[i].equals("7")){
                num[7]++;
            }else if(str[i].equals("8")){
                num[8]++;
            }else{
                num[9]++;
            }
        }
        for(int i = 0; i<10;i++){
            System.out.println(num[i]);
        }
       
        
    }
    
}
