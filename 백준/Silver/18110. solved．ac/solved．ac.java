//불리언 통해서  이전 위치 확인하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		Scanner sc = new Scanner (System.in);
		
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		if(n==0) {
			System.out.println(0);
		}else {
			
			int f =Math.round(n*15/(100.0f));
			for(int i=0;i<n;i++) {
				pq.add(Integer.parseInt(br.readLine()));
			}
			for(int i=0;i<f;i++) {
				pq.poll();
			}
			int sum =0;
			for(int i=0;i<n-f-f;i++) {
				sum+=pq.poll();
			}
			float ans = (float)sum/(n-f-f);
			System.out.println(Math.round(ans));
			
		}

				
		
		
	}
	
	
	


}