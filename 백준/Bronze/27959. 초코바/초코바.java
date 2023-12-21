import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 동전의 개수
        int M = scanner.nextInt(); // 초코바의 가격

        int totalMoney = N * 100; // 총 돈

        if (totalMoney >= M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}