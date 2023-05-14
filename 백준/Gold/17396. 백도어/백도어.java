import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class node {
		int end,w;

		public node(int end, int w) {
			super();
			this.end = end;
			this.w = w;
		}
		
	}
	static class spot implements Comparable<spot>{
		int num;
		long p;

		public spot(int num, long p) {
			super();
			this.num = num;
			this.p = p;
		}

		@Override
		public int compareTo(spot o) {			
			return Long.compare(this.p, o.p);
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] nm = br.readLine().split(" ");
		int N = Integer.parseInt(nm[0]);
		int M = Integer.parseInt(nm[1]);
		boolean [] ward = new boolean [N];
		String [] wardarr = br.readLine().split(" ");
		for(int i=0;i<N;i++) {			
			if(wardarr[i].equals("0"))ward[i]=true;
		}
		ward[N-1]=true;
		List<node> [] arr = new List[N];
		for(int i=0;i<N;i++) {
			arr[i]= new ArrayList<>();
		}
		for(int i=0;i<M;i++) {
			String [] str=br.readLine().split(" "); 
			int st = Integer.parseInt(str[0]);
			int ed = Integer.parseInt(str[1]);
			int w = Integer.parseInt(str[2]);
			if(ward[st]&&ward[ed]) {
				arr[st].add(new node(ed,w));
				arr[ed].add(new node(st,w));
			}
		}
		PriorityQueue<spot> pq = new PriorityQueue<>();
		boolean [] vis = new boolean [N];
		long [] wp = new long [N];
		Arrays.fill(wp, Long.MAX_VALUE);
		wp[0]=0;
		pq.add(new spot(0,0));
		while(!pq.isEmpty()) {
			spot x = pq.poll();
			if(x.num==N-1)break;
			if (vis[x.num]) continue;
			vis[x.num]=true;			
			for(node i:arr[x.num]) {
				if(vis[i.end])continue;
				if(wp[i.end]<=x.p+i.w)continue;
				pq.add(new spot(i.end,x.p+i.w));
				wp[i.end]=x.p+i.w;
			}
		}
		if(wp[N-1]==Long.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(wp[N-1]);
		}
		
	}

}