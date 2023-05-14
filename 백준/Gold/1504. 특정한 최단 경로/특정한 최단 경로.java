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
	static int[] p;
	
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
		p = new int [V+1];
		Arrays.fill(p, Integer.MAX_VALUE);
		line = new ArrayList[V+1];
		for(int i=0;i<V+1;i++) {
			line[i]=new ArrayList<node>();
		}
		for(int i=0;i<E;i++) {
			int st = sc.nextInt();
			int ed = sc.nextInt();
			int w = sc.nextInt();
			line[st].add(new node(ed,w));
			line[ed].add(new node(st,w));			
		}
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int sum =shortcut(1,num1);
		sum+=shortcut(num1,num2);
		sum+=shortcut(num2,V);
		if(shortcut(1,num1)==-1||shortcut(num1,num2)==-1||shortcut(num2,V)==-1)
			sum=Integer.MAX_VALUE;
		int sum2 =shortcut(1,num2);
		sum2+=shortcut(num2,num1);
		sum2+=shortcut(num1,V);
		if(shortcut(1,num2)==-1||shortcut(num2,num1)==-1||shortcut(num1,V)==-1)
			sum2=Integer.MAX_VALUE;
		if(Math.min(sum, sum2)==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else
		System.out.println(Math.min(sum, sum2));
		
	}
	static int shortcut (int str,int fin) {
		vist = new boolean[V+1];
		PriorityQueue<spot> pq = new PriorityQueue<>();
		p[str]=0;
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