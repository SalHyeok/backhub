import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        for (int i = 0; i < 6; i++) {
            char result = scanner.next().charAt(0);
            if (result == 'W') {
                wins++;
            }
        }

        int group;
        if (wins >= 5) {
            group = 1;
        } else if (wins >= 3) {
            group = 2;
        } else if (wins >= 1) {
            group = 3;
        } else {
            group = -1;
        }

        System.out.println(group);

        scanner.close();
    }
}