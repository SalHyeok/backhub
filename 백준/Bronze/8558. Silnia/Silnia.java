import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int n = scanner.nextInt();
        int factorial = 1; // 팩토리얼 값 초기화

        // n! 계산
        for (int i = 1; i <= n; i++) {
            factorial *= i;
            // 계산 중간에 10으로 나눈 나머지 값을 저장하여 계속 1의 자리만 유지
            factorial %= 10;
        }

        // 결과 출력
        System.out.println(factorial);

        // 스캐너 닫기
        scanner.close();
    }
}