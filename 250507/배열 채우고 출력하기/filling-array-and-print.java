import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.next();
        }

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }

    }
}