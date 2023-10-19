import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 번역 테이블 초기화
        HashMap<String, String> translationTable = new HashMap<>();
        translationTable.put("CU", "see you");
        translationTable.put(":-)", "I’m happy");
        translationTable.put(":(", "I’m unhappy");
        translationTable.put(";-)", "wink");
        translationTable.put(":-P", "stick out my tongue");
        translationTable.put("(~.~)", "sleepy");
        translationTable.put("TA", "totally awesome");
        translationTable.put("CCC", "Canadian Computing Competition");
        translationTable.put("CUZ", "because");
        translationTable.put("TY", "thank-you");
        translationTable.put("YW", "you’re welcome");
        translationTable.put("TTYL", "talk to you later");

        // 입력 및 번역
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("TTYL")) {
                System.out.println(translationTable.get(input));
                break;
            }
            if (translationTable.containsKey(input)) {
                System.out.println(translationTable.get(input));
            } else {
                System.out.println(input);
            }
        }

        // 스캐너 닫기
        scanner.close();
    }
}