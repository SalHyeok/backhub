import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        int X = scanner.nextInt();

        // X 일에 대한 시간 계산
        int hours = X * 24;

        // 결과 출력
        System.out.println(hours);
    }
}