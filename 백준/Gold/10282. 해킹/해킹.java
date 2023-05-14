import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N,E,M;
    static int [] p;
    static int [] t;
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
		public int compareTo(point o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.pw, o.pw);
		}
    	
    }
    
    static List<node>[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        for(int tc =0;tc<T;tc++) {
        	N = sc.nextInt();
        	E = sc.nextInt();
        	int start = sc.nextInt();
        	
        	arr = new ArrayList[N+1];
        	for(int i=0;i<N+1;i++) {
        		arr[i]=new ArrayList<>();
        	}
        	
        	for(int i=0;i<E;i++) {
        		int ed =sc.nextInt();
        		int st =sc.nextInt();
        		int w =sc.nextInt();
        		arr[st].add(new node(ed,w));                        
        	}
        	PriorityQueue<point> pq = new PriorityQueue<>();//다익의 피큐에는 간선이 아닌 정점을 저장해야함
        	
        	
        	p = new int [N+1];
        	Arrays.fill(p, Integer.MAX_VALUE);
        	boolean[] visited = new boolean[N+1];
        	p[start]=0;        	
        	pq.add(new point(start,0));       
        	bre:while(!pq.isEmpty()) {
        		point k = pq.poll();
        		int st =k.num;        		
        		visited[st]=true;
        		for(node a:arr[st]) {//정점을 하나 뽑아서  그 정점의 현재 최단거리와 (현재 위치 가중치 + 이번 간선의 가중치) 비교
        			if(!visited[a.ed]&&p[a.ed]>p[st]+a.w) {                    
        				p[a.ed]=p[st]+a.w;
//                    from[st]=a.ed;
        				pq.add(new point(a.ed,p[a.ed]));
        			}               
        		}
        	}
        	int cnt =0;
        	int max =0;
        	for(int i=1;i<=N;i++) {
        		if(visited[i]) {
        			cnt++;
        			max=Math.max(max,p[i]);
        		}
        	}    	
        	
        	
        	System.out.println(cnt+" "+max);
        	
        }
//        
//        while(true) {
//        	System.out.println(end);
//        	
//        }
        
    }

}