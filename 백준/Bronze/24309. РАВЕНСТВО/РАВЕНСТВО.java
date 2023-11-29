import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger a = scanner.nextBigInteger();
        BigInteger b = scanner.nextBigInteger();
        BigInteger c = scanner.nextBigInteger();

        // a * x = b - c를 만족하는 x를 계산
        BigInteger x = b.subtract(c).divide(a);

        System.out.println(x);
        
        scanner.close();
    }
}