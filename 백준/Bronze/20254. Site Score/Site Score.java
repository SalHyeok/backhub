import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int UR = sc.nextInt();
        int TR = sc.nextInt();
        int UO = sc.nextInt();
        int TO = sc.nextInt();

        int siteScore = (56 * UR) + (24 * TR) + (14 * UO) + (6 * TO);
        System.out.println(siteScore);

        sc.close();
    }
}