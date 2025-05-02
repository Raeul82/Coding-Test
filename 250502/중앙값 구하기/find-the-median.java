import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ( a > b ) {
            if ( b > c)
                System.out.print(b);
            else {
                if (c > a)
                    System.out.print(a);
                else
                    System.out.print(c);
            }
        }
        else { //b>a
            if (a > c)
                System.out.print(a);
            else { //c>a
                if(c > b)
                    System.out.print(b);
                else
                    System.out.print(c);
            }
        }
    }
}