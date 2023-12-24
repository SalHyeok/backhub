import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 입력 받기
        char firstLetter = scanner.nextLine().charAt(0);

        // 입력된 첫 글자에 따라 동아리 출력
        switch (firstLetter) {
            case 'M':
                System.out.println("MatKor");
                break;
            case 'W':
                System.out.println("WiCys");
                break;
            case 'C':
                System.out.println("CyKor");
                break;
            case 'A':
                System.out.println("AlKor");
                break;
            case '$':
                System.out.println("$clear");
                break;
            default:
                System.out.println("올바른 입력이 아닙니다.");
        }
    }
}