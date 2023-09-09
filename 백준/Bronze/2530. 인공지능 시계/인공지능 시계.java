import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 현재 시간을 입력 받음
        int currentHour = scanner.nextInt();
        int currentMinute = scanner.nextInt();
        int currentSecond = scanner.nextInt();

        // 요리 시간(초)을 입력 받음
        int cookingTimeInSeconds = scanner.nextInt();

        // 요리 시간을 현재 시간에 더함
        int totalSeconds = currentHour * 3600 + currentMinute * 60 + currentSecond + cookingTimeInSeconds;

        // 최종 종료 시간 계산
        int finalHour = (totalSeconds / 3600) % 24;
        int finalMinute = (totalSeconds % 3600) / 60;
        int finalSecond = totalSeconds % 60;

        // 결과 출력
        System.out.println(finalHour + " " + finalMinute + " " + finalSecond);

        scanner.close();
    }
}