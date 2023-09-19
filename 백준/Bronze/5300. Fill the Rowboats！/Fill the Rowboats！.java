import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력: 해적의 총 수
        int N = scanner.nextInt();
        
        // 6명씩 나눠 출력
        for (int i = 1; i <= N; i++) {
            System.out.print(i);
            
            // 매 6번째 해적 뒤에 "Go!" 출력
            if (i % 6 == 0 || i == N) {
                System.out.println(" Go!");
            } else {
                System.out.print(" ");
            }
        }
    }
}