import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().toLowerCase();
            if (input.equals("#")) {
                break;
            }
            
            int vowelCount = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
            }
            
            System.out.println(vowelCount);
        }
        
        scanner.close();
    }
}