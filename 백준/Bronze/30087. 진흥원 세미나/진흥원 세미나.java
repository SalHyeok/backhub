import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> seminars = new HashMap<>();
        seminars.put("Algorithm", "204");
        seminars.put("DataAnalysis", "207");
        seminars.put("ArtificialIntelligence", "302");
        seminars.put("CyberSecurity", "B101");
        seminars.put("Network", "303");
        seminars.put("Startup", "501");
        seminars.put("TestStrategy", "105");

        int N = sc.nextInt();
        sc.nextLine(); // 개행문자 처리

        for (int i = 0; i < N; i++) {
            String seminar = sc.nextLine();
            System.out.println(seminars.get(seminar));
        }
        sc.close();
    }
}