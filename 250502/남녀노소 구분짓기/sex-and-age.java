import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if(gender == 1) {
            if (age >= 19) {
                System.out.print("WOMAN");
            }
            else {
                System.out.print("GIRL");
            }
        }
        else {
            if (age >= 19) {
                System.out.print("MAN");
            }
            else {
                System.out.print("BOY");
            }
         }
    }
}