import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            for(int j=0; j<i; j++) {
                sum += 1;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}