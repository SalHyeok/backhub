import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

        int row = K / M;
        int col = K % M;

        System.out.println(row + " " + col);

        scanner.close();
    }
}