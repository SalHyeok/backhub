import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s1 = sc.nextInt();
        int s2 = sc.nextInt();

        if (s1 * 2 < s2) {
            System.out.println("H");
        } else {
            System.out.println("E");
        }

        sc.close();
    }
}