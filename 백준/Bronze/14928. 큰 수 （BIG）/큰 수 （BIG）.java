import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().trim();
        int len = input.length();
        long modulo = 20000303;
        long remainder = 0;

        for (int i = 0; i < len; i++) {
            char digit = input.charAt(i);
            remainder = (remainder * 10 + (digit - '0')) % modulo;
        }

        System.out.println(remainder);
    }
}