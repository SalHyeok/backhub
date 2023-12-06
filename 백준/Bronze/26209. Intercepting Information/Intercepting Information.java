import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 8개의 정수 입력 받기
        int[] values = new int[8];
        for (int i = 0; i < 8; i++) {
            values[i] = scanner.nextInt();
        }

        // 9가 있는지 확인하여 결과 출력
        boolean failed = false;
        for (int value : values) {
            if (value == 9) {
                failed = true;
                break;
            }
        }

        if (failed) {
            System.out.println("F"); // 실패 출력
        } else {
            System.out.println("S"); // 성공 출력
        }
    }
}