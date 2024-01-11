import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int k = scanner.nextInt();
            printHistogram(k);
        }

        scanner.close();
    }

    private static void printHistogram(int k) {
        for (int j = 0; j < k; j++) {
            System.out.print("=");
        }
        System.out.println(); // 줄 바꿈
    }
}