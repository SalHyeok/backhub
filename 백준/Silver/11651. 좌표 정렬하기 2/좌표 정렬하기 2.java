import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        // y좌표를 먼저 오름차순으로 정렬하고, y좌표가 같은 경우 x좌표를 오름차순으로 정렬
        if (this.y == other.y) {
            return this.x - other.x;
        }
        return this.y - other.y;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Point> points = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new Point(x, y));
        }

        // 정렬
        Collections.sort(points);

        // 결과 출력
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }
    }
}