import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mr. A의 도착 및 퇴근 시간 입력
        int aArrivalH = scanner.nextInt();
        int aArrivalM = scanner.nextInt();
        int aArrivalS = scanner.nextInt();
        int aDepartureH = scanner.nextInt();
        int aDepartureM = scanner.nextInt();
        int aDepartureS = scanner.nextInt();

        // Mr. B의 도착 및 퇴근 시간 입력
        int bArrivalH = scanner.nextInt();
        int bArrivalM = scanner.nextInt();
        int bArrivalS = scanner.nextInt();
        int bDepartureH = scanner.nextInt();
        int bDepartureM = scanner.nextInt();
        int bDepartureS = scanner.nextInt();

        // Mr. C의 도착 및 퇴근 시간 입력
        int cArrivalH = scanner.nextInt();
        int cArrivalM = scanner.nextInt();
        int cArrivalS = scanner.nextInt();
        int cDepartureH = scanner.nextInt();
        int cDepartureM = scanner.nextInt();
        int cDepartureS = scanner.nextInt();

        // 근무 시간 계산
        int aWorkingHours = calculateWorkingHours(aArrivalH, aArrivalM, aArrivalS, aDepartureH, aDepartureM, aDepartureS);
        int bWorkingHours = calculateWorkingHours(bArrivalH, bArrivalM, bArrivalS, bDepartureH, bDepartureM, bDepartureS);
        int cWorkingHours = calculateWorkingHours(cArrivalH, cArrivalM, cArrivalS, cDepartureH, cDepartureM, cDepartureS);

        // 결과 출력
        System.out.println(formatHours(aWorkingHours));
        System.out.println(formatHours(bWorkingHours));
        System.out.println(formatHours(cWorkingHours));
    }

    // 근무 시간 계산 함수
    private static int calculateWorkingHours(int arrivalH, int arrivalM, int arrivalS, int departureH, int departureM, int departureS) {
        int totalSecondsArrival = arrivalH * 3600 + arrivalM * 60 + arrivalS;
        int totalSecondsDeparture = departureH * 3600 + departureM * 60 + departureS;
        return totalSecondsDeparture - totalSecondsArrival;
    }

    // 시간을 시, 분, 초로 변환하여 문자열로 반환하는 함수
    private static String formatHours(int totalSeconds) {
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        return hours + " " + minutes + " " + seconds;
    }
}