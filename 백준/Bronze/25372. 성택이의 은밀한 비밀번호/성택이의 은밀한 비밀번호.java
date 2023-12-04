import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리

        for (int i = 0; i < N; i++) {
            String password = scanner.nextLine();
            if (isValidPassword(password)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

        scanner.close();
    }

    // 현관문 비밀번호 유효성 검사 함수
    public static boolean isValidPassword(String password) {
        int length = password.length();
        return length >= 6 && length <= 9 && password.matches("[a-zA-Z0-9]+");
    }
}