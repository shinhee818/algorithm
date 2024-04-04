package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon8958 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int k = scanner.nextInt();
       scanner.nextLine();
       String [] arr = new String[k];

       for (int i =0; i<k; i++){
        arr[i] = scanner.nextLine();
       }

       for(int s = 0; s< k;s++){
        int c = 0;
        int sum =0;
        for(int j =0; j < arr[s].length(); j++){
            if(arr[s].charAt(j)=='O'){
                c++;
                sum +=c;
            }else{
                c =0 ;
                
            }
        }
        System.out.println(sum);
       }
    } 
}
