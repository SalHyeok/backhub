import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 입력 받기
        int endDay = scanner.nextInt();
        int endHour = scanner.nextInt();
        int endMinute = scanner.nextInt();
        
        // 대회 시작 시간과 날짜
        int startDay = 11;
        int startHour = 11;
        int startMinute = 11;
        
        // 대회 종료 시간과 날짜를 분 단위로 변환
        int totalStartMinutes = startDay * 24 * 60 + startHour * 60 + startMinute;
        int totalEndMinutes = endDay * 24 * 60 + endHour * 60 + endMinute;
        
        // 대회 시간 계산
        int contestDuration = totalEndMinutes - totalStartMinutes;
        
        // 대회 시간이 음수인 경우 -1 출력, 그렇지 않으면 대회 시간 출력
        if (contestDuration < 0) {
            System.out.println(-1);
        } else {
            System.out.println(contestDuration);
        }
    }
}