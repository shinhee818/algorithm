package baekjoon.문자열;
import java.util.Arrays;
import java.util.Scanner;

public class baekjoon1000{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Long collect = Long.valueOf(Arrays.stream(scanner.nextLine().split(" "))
        .map(Integer::parseInt)
                        .reduce(0, Integer::sum));

        System.out.println(collect);
    }
}