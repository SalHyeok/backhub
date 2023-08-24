
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        
        ArrayList<Integer> divisors = getDivisors(N);
        
        if (K <= divisors.size()) {
            System.out.println(divisors.get(K - 1));
        } else {
            System.out.println(0);
        }
    }
    
    public static ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }
}