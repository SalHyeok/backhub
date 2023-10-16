import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] depthReadings = new int[4];

        for (int i = 0; i < 4; i++) {
            depthReadings[i] = scanner.nextInt();
        }

        if (isFishRising(depthReadings)) {
            System.out.println("Fish Rising");
        } else if (isFishDiving(depthReadings)) {
            System.out.println("Fish Diving");
        } else if (isConstantDepth(depthReadings)) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }

    public static boolean isFishRising(int[] depths) {
        for (int i = 1; i < depths.length; i++) {
            if (depths[i] <= depths[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isFishDiving(int[] depths) {
        for (int i = 1; i < depths.length; i++) {
            if (depths[i] >= depths[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isConstantDepth(int[] depths) {
        for (int i = 1; i < depths.length; i++) {
            if (depths[i] != depths[i - 1]) {
                return false;
            }
        }
        return true;
    }
}