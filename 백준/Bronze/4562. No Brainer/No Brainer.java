import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 데이터 셋의 개수

        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt(); // 먹은 뇌의 개수
            int y = scanner.nextInt(); // 필요한 뇌의 개수

            // 조건에 따라 출력
            if (x >= y) {
                System.out.println("MMM BRAINS");
            } else {
                System.out.println("NO BRAINS");
            }
        }

        scanner.close();
    }
}