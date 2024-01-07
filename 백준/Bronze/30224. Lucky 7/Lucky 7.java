import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        if (num % 7 == 0) {
            if (String.valueOf(num).contains("7")) {
                System.out.println("3");
            } else {
                System.out.println("1");
            }
        } else {
            if (String.valueOf(num).contains("7")) {
                System.out.println("2");
            } else {
                System.out.println("0");
            }
        }
    }
}