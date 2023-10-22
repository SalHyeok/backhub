import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int datasets = scanner.nextInt();
        
        for (int i = 0; i < datasets; i++) {
            int length = scanner.nextInt();
            int width = scanner.nextInt();
            
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < length; k++) {
                    System.out.print("X");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}