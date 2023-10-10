import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String correctedLine = correctSpelling(line);
            System.out.println(correctedLine);
        }

        scanner.close();
    }

    public static String correctSpelling(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 'i') {
                charArray[i] = 'e';
            } else if (c == 'e') {
                charArray[i] = 'i';
            } else if (c == 'I') {
                charArray[i] = 'E';
            } else if (c == 'E') {
                charArray[i] = 'I';
            }
        }
        return new String(charArray);
    }
}