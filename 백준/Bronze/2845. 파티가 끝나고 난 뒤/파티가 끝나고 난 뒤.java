import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        int P = scanner.nextInt();
        int[] participants = new int[5];

        for (int i = 0; i < 5; i++) {
            participants[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            int diff = participants[i] - (L * P);
            System.out.print(diff + " ");
        }
    }
}