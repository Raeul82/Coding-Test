import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < odd; j++) 
                System.out.print("*");
            odd += 2;    
            System.out.println();
        }
    }
}