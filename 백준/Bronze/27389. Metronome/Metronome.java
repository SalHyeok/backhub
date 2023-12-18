import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 한 번의 키 돌리기당 4번의 ticks가 발생하므로
        // 전체 ticks 수를 4로 나누고 이를 소수점으로 유지하기 위해 double 형으로 계산합니다.
        double revolutions = (double) n / 4;
        
        // 소수점 둘째 자리까지 출력하기 위해 형식화된 문자열로 출력합니다.
        System.out.printf("%.2f", revolutions);
        
        sc.close();
    }
}