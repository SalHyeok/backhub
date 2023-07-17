
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		PriorityQueue<Integer> pq =new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			pq.add(sc.nextInt());
		}
		int l =sc.nextInt();
		int max=0;
		while(!pq.isEmpty()) {
			int x =pq.poll();
			if(x==l) {
				System.out.println(0);
				break;
			}
			else if(x>l) {
				
				System.out.println((l-max)*(x-l)-1);
				break;
			}
			else {
				max=x;
			}
			
		}
		
		
	}
	

}