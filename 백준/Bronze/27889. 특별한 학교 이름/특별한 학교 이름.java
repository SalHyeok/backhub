import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String abbreviation = sc.nextLine();
        
        String fullName = getFullName(abbreviation);
        System.out.println(fullName);
    }
    
    public static String getFullName(String abbreviation) {
        switch (abbreviation) {
            case "NLCS":
                return "North London Collegiate School";
            case "BHA":
                return "Branksome Hall Asia";
            case "KIS":
                return "Korea International School";
            case "SJA":
                return "St. Johnsbury Academy";
            default:
                return "해당하는 학교가 없습니다.";
        }
    }
}