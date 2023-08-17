import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextInt();
        }

        Arrays.sort(a); // 배열 a를 오름차순으로 정렬
        Arrays.sort(b); // 배열 b를 오름차순으로 정렬

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * b[n - 1 - i]; // 가장 작은 값과 가장 큰 값을 곱해 합산
        }

        System.out.println(sum);

        scanner.close();
    }
}