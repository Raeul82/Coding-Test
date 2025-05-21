import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr1 = new int[4][4];
        int[][] arr2 = new int[4][4];
        int total = 0;

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<4; i++) {
            total = 0;
            for(int j=0; j<4; j++) {
                total += arr1[i][j];
            } System.out.print(total);
            System.out.println();
        }
    }
}