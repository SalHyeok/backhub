import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(m>n) {
        	System.out.println(n-1+n*(m-1));
        }
        else {
        	System.out.println(m-1+m*(n-1));
        }
        
    }
}