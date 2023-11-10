import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력
        BigInteger A = scanner.nextBigInteger();
        BigInteger B = scanner.nextBigInteger();

        // A + B 출력
        System.out.println(A.add(B));

        // 스캐너 닫기
        scanner.close();
    }
}