import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N을 입력 받음
        
        for (int i = 1; i <= N; i++) {
            System.out.println("Hello World, Judge " + i + "!");
        }
        
        scanner.close(); // 스캐너 닫기
    }
}
