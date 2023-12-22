import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int busTime = A;
        int subwayTime = B;

        if (busTime < subwayTime) {
            System.out.println("Bus");
        } else if (busTime > subwayTime) {
            System.out.println("Subway");
        } else {
            System.out.println("Anything");
        }

        sc.close();
    }
}