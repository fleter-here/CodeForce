import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long distinct = sc.next().chars().distinct().count();

        System.out.println(distinct % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");

        sc.close();
    }
}
