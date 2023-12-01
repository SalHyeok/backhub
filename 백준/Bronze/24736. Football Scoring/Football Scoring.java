import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 방문팀과 홈팀의 점수 입력 받기
        String[] visitingTeamInput = scanner.nextLine().split(" ");
        String[] homeTeamInput = scanner.nextLine().split(" ");

        // 문자열로 입력된 값을 정수형으로 변환하여 변수에 저장
        int[] visitingTeamScores = new int[5];
        int[] homeTeamScores = new int[5];

        for (int i = 0; i < 5; i++) {
            visitingTeamScores[i] = Integer.parseInt(visitingTeamInput[i]);
            homeTeamScores[i] = Integer.parseInt(homeTeamInput[i]);
        }

        // 각 팀의 총점 계산
        int visitingScore = calculateScore(visitingTeamScores);
        int homeScore = calculateScore(homeTeamScores);

        // 결과 출력
        System.out.println(visitingScore + " " + homeScore);

        scanner.close();
    }

    // 각 팀의 총점을 계산하는 메서드
    public static int calculateScore(int[] scores) {
        int totalScore = 0;
        totalScore += scores[0] * 6; // Touchdown (6점)
        totalScore += scores[1] * 3; // Field Goal (3점)
        totalScore += scores[2] * 2; // Safety (2점)
        totalScore += scores[3];     // Points-after-touchdown (1점)
        totalScore += scores[4] * 2; // Two-point conversion (2점)

        return totalScore;
    }
}