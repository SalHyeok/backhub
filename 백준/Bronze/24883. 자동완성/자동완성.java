import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alphabet = scanner.next(); // 알파벳 입력 받기

        if (alphabet.equals("N") || alphabet.equals("n")) {
            System.out.println("Naver D2");
        } else {
            System.out.println("Naver Whale");
        }

        scanner.close();
    }
}