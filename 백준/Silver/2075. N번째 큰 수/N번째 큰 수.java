import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static class point implements Comparable<point>{
		int mr;
		

		public point(int mr) {			
			this.mr = mr;
		}


		@Override
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			return Integer.compare(o.mr, this.mr);
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T= Integer.parseInt(br.readLine());
		PriorityQueue<point> pq = new PriorityQueue<>();
		for(int tc = 0;tc<T;tc++) {
			String [] arr = br.readLine().split(" ");
			for(int i=0;i<T;i++) {
				pq.add(new point(Integer.parseInt(arr[i])));
			}			
		}
		for(int i=1;i<T;i++) {
			pq.poll();
		}
		System.out.println(pq.poll().mr);
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}