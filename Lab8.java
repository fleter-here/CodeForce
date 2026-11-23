import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cmp = String.CASE_INSENSITIVE_ORDER.compare(sc.next(), sc.next());

        System.out.println(Integer.signum(cmp));

        sc.close();
    }
}
