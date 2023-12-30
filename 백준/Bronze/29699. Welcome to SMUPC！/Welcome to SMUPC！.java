import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        String label = "WelcomeToSMUPC";
        char result = label.charAt((N - 1) % label.length());
        System.out.println(result);
    }
}