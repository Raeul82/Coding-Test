import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n;

         System.out.print(sum + " ");

        for (int i=0; i<=3; i++) {
            sum += n;
            System.out.print(sum + " ");
        }
        // Please write your code here.
    }
}