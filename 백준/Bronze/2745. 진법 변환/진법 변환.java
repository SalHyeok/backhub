import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        int base = scanner.nextInt();
        int result = 0;
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            result = result * base + digit;
        }
        
        System.out.println(result);
    }
}
