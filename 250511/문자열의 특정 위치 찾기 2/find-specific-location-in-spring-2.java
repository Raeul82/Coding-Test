import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] str = {"apple", "banana", "grape", "blueberry", "orange"};
        char newStr = sc.next().charAt(0);
        int cnt = 0;
        for(int i=0; i<str.length; i++){
            if(str[i].charAt(2) == newStr || str[i].charAt(3) == newStr){
                System.out.println(str[i]);
                cnt++;
            }

        }
        System.out.print(cnt);
    }
}