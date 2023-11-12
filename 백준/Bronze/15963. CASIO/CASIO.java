import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 송찬이가 필요한 배터리와 선생님이 가져온 배터리 입력
        long requiredBattery = sc.nextLong();
        long teacherBattery = sc.nextLong();

        // 송찬이가 원하는 배터리인지 확인 후 출력
        if (requiredBattery == teacherBattery) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}