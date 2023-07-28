import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        HashMap<Integer, Integer> cardMap = new HashMap<>();
        
        // 숫자 카드들을 HashMap에 저장하며 개수를 센다.
        for (int i = 0; i < n; i++) {
            int card = Integer.parseInt(st.nextToken());
            cardMap.put(card, cardMap.getOrDefault(card, 0) + 1);
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        
        // 찾고자 하는 숫자들의 개수를 HashMap에서 찾아서 결과에 저장한다.
        for (int i = 0; i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            int count = cardMap.getOrDefault(target, 0);
            sb.append(count).append(" ");
        }
        
        System.out.println(sb.toString());
    }
}