import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            sb.append(line).append("\n");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}
