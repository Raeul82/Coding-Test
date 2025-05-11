import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int cnt3 = 0;
        int cnt5 = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if (arr[i] % 3 == 0)
                cnt3++;
            if (arr[i] % 5 == 0)
                cnt5++;
        }
        System.out.print(cnt3 + " " + cnt5);
    }
}