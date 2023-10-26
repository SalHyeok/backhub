import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int result = 0;

        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                result = 2; // 정삼각형
            } else if (a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b) {
                result = 1; // 직각삼각형
            }
        }

        System.out.println(result);
    }
}