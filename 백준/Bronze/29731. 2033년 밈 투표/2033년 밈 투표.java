import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        String[] promises = new String[N];
        for (int i = 0; i < N; i++) {
            promises[i] = sc.nextLine();
        }

        boolean isChanged = false;
        for (String promise : promises) {
            if (!isRickAstleyPromise(promise)) {
                isChanged = true;
                break;
            }
        }

        if (isChanged) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean isRickAstleyPromise(String promise) {
        String[] rickAstleyPromises = {
            "Never gonna give you up",
            "Never gonna let you down",
            "Never gonna run around and desert you",
            "Never gonna make you cry",
            "Never gonna say goodbye",
            "Never gonna tell a lie and hurt you",
            "Never gonna stop"
        };

        for (String rickAstleyPromise : rickAstleyPromises) {
            if (promise.equals(rickAstleyPromise)) {
                return true;
            }
        }
        return false;
    }
}