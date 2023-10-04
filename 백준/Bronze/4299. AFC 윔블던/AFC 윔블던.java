import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int sum = scanner.nextInt();
        int difference = scanner.nextInt();
        
        // 계산해서 출력
        int a = (sum + difference) / 2;
        int b = (sum - difference) / 2;
        
        if (a >= 0 && b >= 0 && a + b == sum && Math.abs(a - b) == difference) {
            if (a > b) {
                System.out.println(a + " " + b);
            } else {
                System.out.println(b + " " + a);
            }
        } else {
            System.out.println(-1);
        }
    }
}