import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        ArrayList<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }

        indices.sort((i, j) -> {
            if (A[i] != A[j]) {
                return Integer.compare(A[i], A[j]);
            }
            return Integer.compare(i, j);
        });

        for (int i = 0; i < N; i++) {
            B[indices.get(i)] = i;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}