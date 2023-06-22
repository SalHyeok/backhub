import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // 테스트 케이스의 개수

        while (t-- > 0) {
            int a = sc.nextInt(); // a의 값
            int b = sc.nextInt(); // b의 값

            int result = 1;
            for (int i = 0; i < b; i++) {
                result = (result * a) % 10;
            }

            if (result == 0) {
                result = 10;
            }

            System.out.println(result);
        }

        sc.close();
    }
}