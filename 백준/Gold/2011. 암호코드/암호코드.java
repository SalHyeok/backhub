import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static final int MOD = 1000000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int length = input.length();

        long[] dp = new long[length + 1];
        dp[0] = 1;
        dp[1] = 1;

        if (input.charAt(0) == '0') {
            System.out.println(0);
        } else {
            for (int i = 2; i <= length; i++) {
                char prevDigit = input.charAt(i - 2);
                char currDigit = input.charAt(i - 1);

                if (currDigit > '0') {
                    dp[i] = dp[i - 1] % MOD;
                }

                int twoDigits = (prevDigit - '0') * 10 + (currDigit - '0');
                if (twoDigits >= 10 && twoDigits <= 26) {
                    dp[i] = (dp[i] + dp[i - 2]) % MOD;
                }
            }
            System.out.println(dp[length]);
        }
    }
}