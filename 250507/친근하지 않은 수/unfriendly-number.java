import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cnt=0;
        for (int i=1; i<=num; i++) {
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}