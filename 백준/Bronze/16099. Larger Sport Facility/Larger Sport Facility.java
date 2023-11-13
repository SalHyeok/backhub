import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int lt = scanner.nextInt(); // Length of TelecomParisTech
            int wt = scanner.nextInt(); // Width of TelecomParisTech
            int le = scanner.nextInt(); // Length of Eurecom
            int we = scanner.nextInt(); // Width of Eurecom

            long areaTelecomParisTech = (long) lt * wt; // Calculate area of TelecomParisTech
            long areaEurecom = (long) le * we; // Calculate area of Eurecom

            if (areaTelecomParisTech > areaEurecom) {
                System.out.println("TelecomParisTech");
            } else if (areaTelecomParisTech < areaEurecom) {
                System.out.println("Eurecom");
            } else {
                System.out.println("Tie");
            }
        }

        scanner.close();
    }
}