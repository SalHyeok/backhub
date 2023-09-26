import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Z = scanner.nextInt(); // 테스트 세트 수

        for (int i = 0; i < Z; i++) {
            int W = scanner.nextInt(); // 방의 행 수
            int K = scanner.nextInt(); // 방의 열 수

            // 최대 관광객 수 계산
            int maxTourists = (W * K) / 2;

            System.out.println(maxTourists);
        }
    }
}