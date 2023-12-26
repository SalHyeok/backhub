import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int sum = 0;
        int sumOfCubes = 0;

        for (int i = 1; i <= N; i++) {
            sum += i;
            sumOfCubes += i * i * i;
        }

        System.out.println(sum);
        System.out.println(sum * sum);
        System.out.println(sumOfCubes);

        scanner.close();
    }
}