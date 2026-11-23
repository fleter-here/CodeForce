import java.util.Scanner;

public class Lab5 {                                                                                                                      
    public static void main(String[] args) {                                                                                             
        Scanner sc = new Scanner(System.in);
                                                                                                                                         
        int n = sc.nextInt();                                                                                                            
        int k = sc.nextInt();                                                                                                            
                                                                                                                                         
        int a = 0;                                                                                                               
        int b = 0;        

        int score;
        for (int i = 1; i <= k; i++) {
            score = sc.nextInt();
            if (score > 0) {
                a++;
            }
            b = score;
        }
        
        if (b > 0) {
            for (int i = k + 1; i <= n; i++) {
                score = sc.nextInt();
                if (score == b) {
                    a++;
                } else {
                    break;
                }
            }
        }
        
        System.out.println(a);
        
        sc.close();
    }
}