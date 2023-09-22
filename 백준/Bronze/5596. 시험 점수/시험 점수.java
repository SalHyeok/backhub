import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 민국과 만세의 네 과목 점수 입력
        int mingukInfo = scanner.nextInt();
        int mingukMath = scanner.nextInt();
        int mingukScience = scanner.nextInt();
        int mingukEnglish = scanner.nextInt();

        int manseInfo = scanner.nextInt();
        int manseMath = scanner.nextInt();
        int manseScience = scanner.nextInt();
        int manseEnglish = scanner.nextInt();

        // 민국과 만세의 총점 계산
        int mingukTotal = mingukInfo + mingukMath + mingukScience + mingukEnglish;
        int manseTotal = manseInfo + manseMath + manseScience + manseEnglish;

        // 큰 총점 출력
        if (mingukTotal >= manseTotal) {
            System.out.println(mingukTotal);
        } else {
            System.out.println(manseTotal);
        }
    }
}