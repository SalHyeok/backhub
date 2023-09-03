import java.util.*;

class Meeting implements Comparable<Meeting> {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Meeting other) {
        if (this.end == other.end) {
            return this.start - other.start;
        }
        return this.end - other.end;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Meeting> meetings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            meetings.add(new Meeting(start, end));
        }

        Collections.sort(meetings);

        int count = 1;
        int endTime = meetings.get(0).end;

        for (int i = 1; i < n; i++) {
            if (meetings.get(i).start >= endTime) {
                count++;
                endTime = meetings.get(i).end;
            }
        }

        System.out.println(count);
    }
}