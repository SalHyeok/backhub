import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) {
        	int n =sc.nextInt();
        	System.out.print(n/25+" ");
        	n=n%25;
        	System.out.print(n/10+" ");
        	n=n%10;
        	System.out.print(n/5+" ");
        	n=n%5;
        	System.out.println(n);
        }
    }
}