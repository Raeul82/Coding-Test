import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int temp = sc.nextInt();

        if (temp < 0) {
            System.out.print("ice");
        } else if (temp >= 100) {
            System.out.print("vapor");
        } else if ((temp >= 0) && (temp <= 100)) {
            System.out.print("water");
        }
        // Please write your code here.
    }
}