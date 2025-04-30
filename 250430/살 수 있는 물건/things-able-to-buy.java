import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int book = 3000;
        int mask = 1000;

        if (N >= book) {
            System.out.print("book");
        } else if (N >= mask) {
            System.out.print("mask");
        } else {
            System.out.print("no");
        }
        // Please write your code here.
    }
}