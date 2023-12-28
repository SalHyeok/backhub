import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] sequence = new int[n];

        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        int finalPosition = calculateFinalPosition(sequence);
        printResult(finalPosition);
    }

    public static int calculateFinalPosition(int[] sequence) {
        int position = 0;

        for (int num : sequence) {
            if (num == -1) {
                position--;
            } else if (num == 1) {
                position++;
            }
        }

        return position;
    }

    public static void printResult(int position) {
        if (position < 0) {
            System.out.println("Left");
        } else if (position > 0) {
            System.out.println("Right");
        } else {
            System.out.println("Stay");
        }
    }
}