import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = i; // 최악의 경우는 i개의 1의 제곱합으로 표현 가능
            
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        System.out.println(dp[n]);
    }
}