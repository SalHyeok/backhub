import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        scanner.close();

        Map<Integer, Character> problems = new HashMap<>();
        problems.put(2018, 'A');
        problems.put(2019, 'A');
        problems.put(2020, 'A');
        problems.put(2021, 'A');
        problems.put(2022, 'A');

        if (problems.containsKey(year)) {
            System.out.println(problems.get(year));
        } else {
            System.out.println("해당 연도의 UCPC 예선 문제가 없습니다.");
        }
    }
}