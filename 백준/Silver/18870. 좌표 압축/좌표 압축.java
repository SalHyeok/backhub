import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 중복 제거 및 정렬
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        HashMap<Integer, Integer> compressed = new HashMap<>();
        int idx = 0;
        for (int num : sortedArr) {
            if (!compressed.containsKey(num)) {
                compressed.put(num, idx++);
            }
        }

        // 좌표 압축 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(compressed.get(num)).append(" ");
        }

        System.out.println(sb.toString());
    }
}