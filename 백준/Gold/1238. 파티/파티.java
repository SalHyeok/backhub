import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int V,E;
	static List<node>[] line; 
	static boolean[] vist;

	
	static class node {
		int ed,w;

		public node(int ed, int w) {
			super();
			this.ed = ed;
			this.w = w;
		}
	}
	static class spot implements Comparable<spot> {
		int x,p;

		public spot(int x, int p) {
			super();
			this.x = x;
			this.p = p;
		}

		@Override
		public int compareTo(spot o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.p, o.p);
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		V = sc.nextInt();
		E = sc.nextInt();
		int X = sc.nextInt();
		line = new ArrayList[V+1];
		for(int i=0;i<V+1;i++) {
			line[i]=new ArrayList<node>();
		}
		for(int i=0;i<E;i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();
			line[st].add(new node(ed,w));
		
		}
		int max =0;
		for(int i=1;i<=V;i++) {
			int sh = shortcut(i,X)+shortcut(X,i);
			if(max<sh) {
				max=sh;
			}
		}
		System.out.println(max);
		
	}
	static int shortcut (int str,int fin) {
		vist = new boolean[V+1];
		PriorityQueue<spot> pq = new PriorityQueue<>();
		pq.add(new spot(str,0));
		while(!pq.isEmpty()) {
			spot a =pq.poll();
			if(a.x==fin)return a.p;
			vist[a.x]=true;
			for(node i:line[a.x]) {
				if(!vist[i.ed]) {
					pq.add(new spot(i.ed,a.p+i.w));
				}
			}			
		}
		return -1;
	}
	

}