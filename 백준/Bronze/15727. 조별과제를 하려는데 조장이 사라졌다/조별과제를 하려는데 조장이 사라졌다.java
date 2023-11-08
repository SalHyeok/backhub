import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 성우와 민건이의 거리 입력 받기
        sc.close();
        
        int minTime = (int) Math.ceil((double)L / 5); // 최소 이동 시간 계산 (올림 적용)
        
        System.out.println(minTime); // 결과 출력
    }
}