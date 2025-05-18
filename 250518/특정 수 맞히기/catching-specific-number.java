import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int ans = sc.nextInt();
            if (ans > 25) {
                System.out.println("Lower");
                continue;
            }
            else if (ans < 25) {
                System.out.println("Higher");
                continue;
            }
            else if (ans == 25) break;
        }
         System.out.println("Good");
    }
}