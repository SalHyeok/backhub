import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력값 받기
        int N = scanner.nextInt();
        
        // 십의 자리와 일의 자리가 같은지 확인하여 출력
        if (N / 10 == N % 10) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}