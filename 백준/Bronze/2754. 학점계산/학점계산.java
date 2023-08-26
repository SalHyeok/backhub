import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 각 학점에 대한 점수를 저장하는 HashMap
        HashMap<String, Double> gradeToScore = new HashMap<>();
        gradeToScore.put("A+", 4.3);
        gradeToScore.put("A0", 4.0);
        gradeToScore.put("A-", 3.7);
        gradeToScore.put("B+", 3.3);
        gradeToScore.put("B0", 3.0);
        gradeToScore.put("B-", 2.7);
        gradeToScore.put("C+", 2.3);
        gradeToScore.put("C0", 2.0);
        gradeToScore.put("C-", 1.7);
        gradeToScore.put("D+", 1.3);
        gradeToScore.put("D0", 1.0);
        gradeToScore.put("D-", 0.7);
        gradeToScore.put("F", 0.0);

        Scanner scanner = new Scanner(System.in);
        String grade = scanner.nextLine(); // 학점 입력

        // 입력받은 학점에 대한 점수 출력
        if (gradeToScore.containsKey(grade)) {
            double score = gradeToScore.get(grade);
            System.out.println(score);
        } else {
            System.out.println("잘못된 학점입니다.");
        }
    }
}