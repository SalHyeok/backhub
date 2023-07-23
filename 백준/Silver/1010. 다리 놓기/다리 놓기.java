import java.util.Scanner;

public class Main {
    // 메모이제이션을 위한 배열
    static long[][] dp;

    // 조합 계산을 위한 함수
    static long combination(int n, int r) {
        if (r == 0 || r == n) {
            return 1;
        }

        // 이미 계산한 값이 있다면 그 값을 반환
        if (dp[n][r] != 0) {
            return dp[n][r];
        }

        // 계산하지 않은 값은 계산 후 배열에 저장
        dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        return dp[n][r];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // 서쪽 사이트 수
            int M = sc.nextInt(); // 동쪽 사이트 수

            // 메모이제이션 배열 초기화
            dp = new long[M + 1][N + 1];

            // 결과 출력
            System.out.println(combination(M, N));
        }
        sc.close();
    }
}