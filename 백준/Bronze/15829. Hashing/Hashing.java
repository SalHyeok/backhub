import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        br.close();

        BigInteger result = BigInteger.ZERO;
        BigInteger r = BigInteger.valueOf(31);
        BigInteger m = BigInteger.valueOf(1234567891);

        for (int i = 0; i < n; i++) {
            int charValue = input.charAt(i) - 'a' + 1;
            BigInteger charHash = BigInteger.valueOf(charValue).multiply(r.pow(i));
            result = result.add(charHash).mod(m);
        }

        System.out.println(result);
    }
}