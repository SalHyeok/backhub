import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arrow = new int[3];
    static int N, M, D, max;
    static int[][] arr;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nmd = br.readLine().split(" ");
        N = Integer.parseInt(nmd[0]);
        M = Integer.parseInt(nmd[1]);
        D = Integer.parseInt(nmd[2]);
        arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }
        max = 0;
        // Changed loop boundary condition from "i < M - 2" to "i < M"
        for (int i = 0; i < M; i++) {
            arrow[0] = i;
            // Changed loop boundary condition from "j < M - 1" to "j < M"
            for (int j = i + 1; j < M; j++) {
                arrow[1] = j;
                // Changed loop boundary condition from "k < M" to "k < M"
                for (int k = j + 1; k < M; k++) {
                    arrow[2] = k;
                    int[][] arr2 = new int[N][M];
                    for (int r = 0; r < N; r++) {
                        System.arraycopy(arr[r], 0, arr2[r], 0, M);
                    }
                    simulate(arr2);
                }
            }
        }
        System.out.println(max);
    }

    private static void simulate(int[][] arr2) {
        int point = 0;
        for (int i = N - 1; i >= 0; i--) {
            boolean[][] vis = new boolean[N][M];
            X:
            for (int j = 0; j < 3; j++) {
                for (int d = 0; d < D; d++) {
                    for (int n = -d; n <= d; n++) {
                        int nr = i - d + Math.abs(n);
                        int nc = arrow[j] + n;
                        if (nr < 0 || nc < 0 || nr >= N || nc >= M) continue;
                        if (vis[nr][nc]) continue X;
                        if (arr2[nr][nc] == 1) {
                            arr2[nr][nc] = 0;
                            vis[nr][nc] = true;
                            point++;
                            continue X;
                        }
                    }
                }
            }
        }
        if (point > max) {
            max = point;
        }
    }
}