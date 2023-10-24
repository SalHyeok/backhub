import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNumber = 1;

        while (true) {
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }

            int[] data = new int[n];
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }

            double median;
            if (n % 2 == 0) {
                median = (data[n / 2 - 1] + data[n / 2]) / 2.0;
            } else {
                median = data[(n - 1) / 2];
            }

            System.out.println("Case " + caseNumber + ": " + median);
            caseNumber++;
        }
        scanner.close();
    }
}