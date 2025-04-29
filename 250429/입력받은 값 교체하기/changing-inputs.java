import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int temp;
        
        temp = a;
        a = b;
        b = temp;
        System.out.print(a + " " + b);
        // Please write your code here.
    }
}