import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 6개의 빈 용기 개수를 입력받음
        int[] containers = new int[6];
        for (int i = 0; i < 6; i++) {
            containers[i] = scanner.nextInt();
        }        
        int refund = 0;
        for (int i = 0; i < 6; i++) {
            refund += containers[i] * 5;
        }
        System.out.println(refund);
        
        scanner.close();
    }
}