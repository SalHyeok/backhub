import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder result = new StringBuilder();
        

        for (int i = 0; i < n/5; i++) {
            result.append("V");            
        }
        for (int i = 0; i < n%5; i++) {
            result.append("I");            
        }
        

        System.out.println(result.toString());
        scanner.close();
    }
}