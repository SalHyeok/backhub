import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        HashMap<Character, Integer> nameCounts = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            char firstLetter = name.charAt(0);

            nameCounts.put(firstLetter, nameCounts.getOrDefault(firstLetter, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        for (char letter : nameCounts.keySet()) {
            if (nameCounts.get(letter) >= 5) {
                result.append(letter);
            }
        }

        if (result.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(result.toString());
        }
    }
}