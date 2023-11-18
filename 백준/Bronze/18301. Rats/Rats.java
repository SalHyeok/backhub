import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n12 = sc.nextInt();
        
        // Chapman 추정치 N 계산
        int N = ((n1 + 1) * (n2 + 1)) / (n12 + 1) - 1;
        
        System.out.println(N);
    }
}