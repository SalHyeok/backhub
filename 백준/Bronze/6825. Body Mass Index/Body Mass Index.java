import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 키와 몸무게 입력 받기
        double weight = scanner.nextDouble(); // 몸무게 입력
        double height = scanner.nextDouble(); // 키 입력

        // BMI 계산
        double bmi = weight / (height * height);

        // BMI 범주에 따라 메시지 출력
        if (bmi > 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5 && bmi <= 25.0) {
            System.out.println("Normal weight");
        } else {
            System.out.println("Underweight");
        }

        scanner.close();
    }
}