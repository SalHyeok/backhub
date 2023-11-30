import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int regularBoxes = scanner.nextInt();
        int smallBoxes = scanner.nextInt();

        int totalCupcakes = regularBoxes * 8 + smallBoxes * 3;
        int totalStudents = 28;

        int cupcakesLeft = totalCupcakes - totalStudents;

        if (cupcakesLeft < 0) {
            cupcakesLeft = 0;
        }

        System.out.println(cupcakesLeft);
    }
}