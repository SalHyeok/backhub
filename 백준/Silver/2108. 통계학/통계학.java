import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        // 수열 입력
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        // 산술평균 계산
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        int mean = (int) Math.round((double) sum / N);

        // 중앙값 계산
        Arrays.sort(numbers);
        int median = numbers[N / 2];

        // 최빈값 계산
        int[] freq = new int[8001]; // -4000 ~ 4000까지의 값이므로 총 8001개의 범위 필요
        for (int num : numbers) {
            freq[num + 4000]++;
        }
        int maxFreq = 0;
        int mode = 0;
        boolean secondMode = false;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                mode = i - 4000;
                secondMode = false;
            } else if (freq[i] == maxFreq && !secondMode) {
                mode = i - 4000;
                secondMode = true;
            }
        }

        // 범위 계산
        int range = numbers[N - 1] - numbers[0];

        // 결과 출력
        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);
    }
}