import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            double weight = scanner.nextDouble();
            if (weight < 0) {
                break;
            }

            double moonWeight = weight * 0.167;
            System.out.printf("Objects weighing %.2f on Earth will weigh %.2f on the moon.\n", weight, moonWeight);
        }

        scanner.close();
    }
}
