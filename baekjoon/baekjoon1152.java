
import java.util.Scanner;

public class baekjoon1152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str= scanner.nextLine().trim();
        String[] list = str.split(" ");
        if(list[0].equals("")){
            System.out.println(0);
        }else{
            System.out.println(list.length);
        }

    }
}
