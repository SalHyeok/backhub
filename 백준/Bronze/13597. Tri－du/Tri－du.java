import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = findMaxCard(A, B);
        System.out.println(result);
    }

    public static int findMaxCard(int A, int B) {
        int[] count = new int[14];
        count[A]++;
        count[B]++;
        int maxCount = 0;
        int maxCard = 0;

        for (int i = 1; i <= 13; i++) {
            count[i]++;
            if (count[i] >= maxCount) {
                maxCount = count[i];
                maxCard = i;
            }
            count[i]--;
        }

        return maxCard;
    }
}