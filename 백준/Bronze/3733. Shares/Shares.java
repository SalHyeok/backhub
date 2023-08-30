import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int N = scanner.nextInt();
            int S = scanner.nextInt();

            int maxSharesPerPerson = S / (N+1);
            System.out.println(maxSharesPerPerson);
        }

        scanner.close();
    }
}