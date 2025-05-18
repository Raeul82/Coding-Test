import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(true) {
            if (a > b) break;
            else System.out.print(a + " " );
            if (a % 2 == 0) {
                a += 3;
                continue;
            } else {
                a *= 2;
                continue;
            }
        }
    }
}