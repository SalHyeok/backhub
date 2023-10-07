import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numDatasets = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < numDatasets; i++) {
            String input = scanner.nextLine();
            String result = deduplicate(input);
            System.out.println(result);
        }
    }

    private static String deduplicate(String input) {
        StringBuilder deduped = new StringBuilder();
        char prevChar = '\0'; // Placeholder for initial value
        
        for (char c : input.toCharArray()) {
            if (c != prevChar) {
                deduped.append(c);
                prevChar = c;
            }
        }
        
        return deduped.toString();
    }
}