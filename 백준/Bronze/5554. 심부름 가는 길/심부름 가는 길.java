import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};
    static int [] arr;


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = sc.nextInt();
        a += sc.nextInt();
        a += sc.nextInt();
        a += sc.nextInt();
        System.out.println(a/60);
        System.out.println(a%60);
    }


	
}