import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0 && n % 3 == 0) {
            System.out.print(true);
        }
        else if (n%2==0 && n%5==0) {
            System.out.print(true);
        }
        else {
            System.out.print(false);
        }
    }
}