import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int leftTines = scanner.nextInt();
        int rightTines = scanner.nextInt();
        
        if (leftTines == 0 && rightTines == 0) {
            System.out.println("Not a moose");
        } else if (leftTines == rightTines) {
            int points = leftTines + rightTines;
            System.out.println("Even " + points);
        } else {
            int points = Math.max(leftTines, rightTines) * 2;
            System.out.println("Odd " + points);
        }
        
        scanner.close();
    }
}