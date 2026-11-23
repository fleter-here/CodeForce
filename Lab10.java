import java.util.Arrays;
import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] terms = sc.next().split("\\+");
        Arrays.sort(terms);

        System.out.println(String.join("+", terms));

        sc.close();
    }
}
