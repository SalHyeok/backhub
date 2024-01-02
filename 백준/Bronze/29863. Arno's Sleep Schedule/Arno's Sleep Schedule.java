import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arno가 잠드는 시간 입력
        int sleepTime = scanner.nextInt();

        // Arno의 알람 설정 시간 입력
        int alarmTime = scanner.nextInt();

        // 잠든 시간부터 깨는 시간까지의 시간 계산
        int sleepDuration;
        if (alarmTime > sleepTime) {
            sleepDuration = alarmTime - sleepTime;
        } else {
            sleepDuration = 24 - sleepTime + alarmTime;
        }

        // 결과 출력
        System.out.println(sleepDuration);
    }
}