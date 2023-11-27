import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int volume = X * X * X;
        System.out.println(volume);
        scanner.close();
    }
}