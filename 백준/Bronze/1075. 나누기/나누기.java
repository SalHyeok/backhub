import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = n-(n % 100); 
        if(x%m==0) {
        	System.out.println("00");
        }
        else{
        	int ans = m-(x%m);
        	if(ans<10) {
        		System.out.println(0+""+ans);
        	}
        	else {
        		System.out.println(ans);
        	}
        }
    }
}