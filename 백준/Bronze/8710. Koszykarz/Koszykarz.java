import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int w = scanner.nextInt();
        int m = scanner.nextInt();

        int hits = 0;
        while (k < w) {
            k += m;
            hits++;
        }

        System.out.println(hits);
    }
}