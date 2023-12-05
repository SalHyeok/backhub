import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int performance = (B / A) * C*3; // WARBOY의 성능 계산

        System.out.println(performance);
    }
}