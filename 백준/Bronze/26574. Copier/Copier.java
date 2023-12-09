import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); // 개행 문자 처리

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            System.out.println(number + " " + number);
        }

        scanner.close();
    }
}