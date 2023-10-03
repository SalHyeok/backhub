import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("Gnomes:");

        for (int i = 0; i < N; i++) {
            int[] beards = new int[3];
            for (int j = 0; j < 3; j++) {
                beards[j] = scanner.nextInt();
            }

            if ((beards[0] < beards[1] && beards[1] < beards[2]) ||
                    (beards[0] > beards[1] && beards[1] > beards[2])) {
                System.out.println("Ordered");
            } else {
                System.out.println("Unordered");
            }
        }

        scanner.close();
    }
}
