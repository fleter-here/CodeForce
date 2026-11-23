import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        int petya;
        int vasya;
        int tonya;
        for (int i = 0; i < n; i++) {
            petya = sc.nextInt();
            vasya = sc.nextInt();
            tonya = sc.nextInt();
            if (petya + vasya + tonya >= 2) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}