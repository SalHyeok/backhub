import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int[] a = new int[3];
        int[] c = new int[3];

        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            c[i] = scanner.nextInt();
        }

        scanner.close();

        // b 계산하기
        int[] b = new int[3];
        b[0] = c[0] - a[2];
        b[1] = c[1] / a[1];
        b[2] = c[2] - a[0];

        // 출력
        for (int i = 0; i < 3; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
