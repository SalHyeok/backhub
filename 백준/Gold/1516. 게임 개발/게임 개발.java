
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class bd implements Comparable<bd>{
		int num,t;

		public bd(int num, int t) {
			super();
			this.num = num;
			this.t = t;
		}

		@Override
		public int compareTo(bd o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.t, o.t);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int [] p = new int [N+1];
		int [] build = new int [N+1];		
		int [] time = new int [N+1];
		List<Integer>[] arr = new List [N+1];
		for(int i=0;i<=N;i++) {
			arr[i]= new ArrayList<>();
		}
		for(int n=1;n<=N;n++) {
			time[n]=sc.nextInt();
			while(true) {
				int a =sc.nextInt();
				if(a==-1)break;
				p[n]++;
				arr[a].add(n);
			}
		}
		PriorityQueue<bd> pq = new PriorityQueue<>();
		for(int i=1;i<=N;i++) {
			if(p[i]==0) {
				pq.add(new bd(i,time[i]));
			}
		}
		while(!pq.isEmpty()) {
			bd X = pq.poll();
			build[X.num]=X.t;
			for(int i:arr[X.num]) {
				p[i]--;
				if(p[i]==0) {
					pq.add(new bd(i,X.t+time[i]));
				}
			}			
		}
		for(int i=1;i<=N;i++) {
			System.out.println(build[i]);
		}
		
	}

}
