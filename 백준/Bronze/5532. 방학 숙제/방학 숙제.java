import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int x =b/d;
        int y =a/c;
        if(b%d!=0)x++;
        if(a%c!=0)y++;
        System.out.println(l-Math.max(x, y));
    }
}