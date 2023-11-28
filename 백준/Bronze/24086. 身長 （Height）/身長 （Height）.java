import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt(); // 1년 전 키
        int B = scanner.nextInt(); // 현재 키

        int growth = B - A; // 키의 증가량 계산

        System.out.println(growth); // 키의 증가량 출력
    }
}