import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            printHeart();            
        }
    }

    public static void printHeart() {
        System.out.println(" @@@   @@@ ");
        System.out.println("@   @ @   @");
        System.out.println("@    @    @");
        System.out.println("@         @");
        System.out.println(" @       @ ");
        System.out.println("  @     @  ");
        System.out.println("   @   @   ");
        System.out.println("    @ @    ");
        System.out.println("     @     ");
    }
}