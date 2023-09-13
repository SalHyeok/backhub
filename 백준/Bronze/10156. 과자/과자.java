import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int [] dr={0,-1,1,0,0};
	static int [] dc={0,0,0,1,-1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		if(m<k*n) {
			System.out.println(k*n-m);
		}
		else {
			
			System.out.println(0);
		}
	
		
		
		
		
		
	}
	
	
	
	

	
	

}