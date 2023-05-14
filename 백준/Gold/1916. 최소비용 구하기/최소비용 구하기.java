import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N,E;
    static int [] p;
    
    static class node {
        int ed,w;

        public node(int ed, int w) {            
            this.ed = ed;
            this.w = w;
        }

    }
    static class point implements Comparable<point>{
    	int num,pw;

		public point(int num, int pw) {
			super();
			this.num = num;
			this.pw = pw;
		}

		@Override
		public int compareTo(Main.point o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.pw, o.pw);
		}
    	
    }
    
    static List<node>[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        E = sc.nextInt();
        p = new int [N+1];
        Arrays.fill(p, Integer.MAX_VALUE);
        arr = new ArrayList[N+1];
        for(int i=0;i<N+1;i++) {
            arr[i]=new ArrayList<>();
        }
        for(int i=0;i<E;i++) {
            int st =sc.nextInt();
            int ed =sc.nextInt();
            int w =sc.nextInt();
            arr[st].add(new node(ed,w));            
        }
        PriorityQueue<point> pq = new PriorityQueue<>();
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean[] visited = new boolean[N+1];
        
        p[start]=0;
        pq.add(new point(start,0));       
        bre:while(!pq.isEmpty()) {
            int st =pq.poll().num;
            if(st==end)break bre;
            visited[st]=true;
            for(node a:arr[st]) {
                if(!visited[a.ed]&&p[a.ed]>p[st]+a.w) {                    
                    p[a.ed]=p[st]+a.w;
                    pq.add(new point(a.ed,p[a.ed]));                    
                }               
            }
        }
        System.out.println(p[end]);
        
    }

}