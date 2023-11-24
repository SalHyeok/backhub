import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        BigInteger result = a.multiply(b);

        System.out.println(result.toString().replaceFirst("^0+(?!$)", ""));
    }
}