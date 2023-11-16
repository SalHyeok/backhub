import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 특정 년도 입력
        int year = sc.nextInt();

        // 홍익대학교 개교 년도
        int foundingYear = 1946;

        // 개교 주년 계산 및 출력
        int anniversary = year - foundingYear;
        System.out.println(anniversary);
    }
}