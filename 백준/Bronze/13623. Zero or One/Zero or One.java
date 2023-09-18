import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 세 개의 입력 값을 읽어옵니다.
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        
        // 세 개의 입력 값 중에서 서로 다른 값이 있는지 확인합니다.
        if (A != B && A != C) {
            System.out.println("A"); // A가 승자입니다.
        } else if (B != A && B != C) {
            System.out.println("B"); // B가 승자입니다.
        } else if (C != A && C != B) {
            System.out.println("C"); // C가 승자입니다.
        } else {
            System.out.println("*"); // 승자가 없습니다.
        }
        
        scanner.close();
    }
}