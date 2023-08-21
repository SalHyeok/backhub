import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());  // 컵의 개수
        int ballPosition = 1;  // 공의 위치 (처음에는 1번 컵에 있음)

        for (int i = 0; i < m; i++) {
            String[] swap = br.readLine().split(" ");
            int cup1 = Integer.parseInt(swap[0]);
            int cup2 = Integer.parseInt(swap[1]);

            if (ballPosition == cup1) {
                ballPosition = cup2;
            } else if (ballPosition == cup2) {
                ballPosition = cup1;
            }
        }

        System.out.println(ballPosition);

        br.close();
    }
}