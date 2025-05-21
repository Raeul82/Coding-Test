import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] row = new int[n][n];
        for(int i=0; i<n; i++) {
            if(i % 2 != 0) {
                for(int j=n; j>0; j--) {
                    row[i][n-j] = j;
                }
            }
            else {
                for(int j=1; j<=n; j++) {
                    row[i][j-1] = j;
                }
            }
        }
        for(int i=0; i<n; i++) {
           for(int j=0; j<n; j++) {
                System.out.print(row[i][j]);
            } System.out.println();
        }
    }
}