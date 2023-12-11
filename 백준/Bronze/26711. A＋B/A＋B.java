import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력값 받기
        String a = scanner.next(); // 첫 번째 숫자
        String b = scanner.next(); // 두 번째 숫자

        // BigInteger를 사용하여 두 큰 수를 더하기
        BigInteger numA = new BigInteger(a);
        BigInteger numB = new BigInteger(b);
        BigInteger sum = numA.add(numB);

        // 결과 출력
        System.out.println(sum);

        scanner.close();
    }
}