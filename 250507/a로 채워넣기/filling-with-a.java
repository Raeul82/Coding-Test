import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(str.substring(0,1)+"a"+str.substring(2, str.length()-2)+"a"+str.substring(str.length()-1));
    }
}