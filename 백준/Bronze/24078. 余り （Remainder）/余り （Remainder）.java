import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int X = scanner.nextInt();

        // X를 21로 나눈 나머지 계산
        int remainder = X % 21;

        // 결과 출력
        System.out.println(remainder);

        scanner.close();
    }
}