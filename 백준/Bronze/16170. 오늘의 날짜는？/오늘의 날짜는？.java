import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // 현재 시각을 UTC+0(세계 표준시)로 변환
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);

        // 연도, 월, 일 출력
        System.out.println(now.getYear());
        System.out.println(String.format("%02d", now.getMonthValue()));
        System.out.println(String.format("%02d", now.getDayOfMonth()));
    }
}