package baekjoon.문자열;
import java.util.Scanner;

public class baekjoon10809 {
	public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
		
		for(int i = 'a'; i <= 'z'; i++) {		
			System.out.print(str.indexOf(i) + " ");
		}
	}
}