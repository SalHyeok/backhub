import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            int totalWidth = calculateWidth(input);
            System.out.println(totalWidth);
        }
    }

    public static int calculateWidth(String input) {
        int totalWidth = 2; // Left and right borders
        for (int i = 0; i < input.length(); i++) {
            char digit = input.charAt(i);
            if (digit == '1') {
                totalWidth += 2;
            } else if (digit == '0') {
                totalWidth += 4;
            } else {
                totalWidth += 3;
            }
            if (i < input.length() - 1) {
                totalWidth += 1; // Gap between digits
            }
        }
        return totalWidth;
    }
}