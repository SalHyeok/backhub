import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 10진수 숫자
        int B = scanner.nextInt(); // 진법
        scanner.close();
        
        StringBuilder result = new StringBuilder();
        while (N > 0) {
            int remainder = N % B;
            if (remainder < 10) {
                result.insert(0, remainder);
            } else {
                result.insert(0, (char)('A' + remainder - 10));
            }
            N /= B;
        }
        
        System.out.println(result);
    }
}