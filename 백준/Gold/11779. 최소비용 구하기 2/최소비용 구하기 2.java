import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N,E;
    static int [] p;
    static int [] from;
    static class node {
        int ed,w;

        public node(int ed, int w) {            
            this.ed = ed;
            this.w = w;
        }

    }
    static class point implements Comparable<point>{
    	int num,pw,cnt;
    	ArrayList<Integer> arr; 
    	

		public point(int num, int pw,int cnt,ArrayList<Integer> arr) {
			super();
			this.num = num;
			this.pw = pw;
			this.cnt=cnt;
			this.arr=arr;
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
            arr[st].add(new node(ed,w));//인접 리스트에 시작 끝 가중치 노드 저장            
        }
        PriorityQueue<point> pq = new PriorityQueue<>();//다익의 피큐에는 간선이 아닌 정점을 저장해야함
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean[] visited = new boolean[N+1];
        
        p[start]=0;
        ArrayList<Integer> road = new ArrayList<>();
        road.add(start);
        pq.add(new point(start,0,1,road));       
        bre:while(!pq.isEmpty()) {
        	point k = pq.poll();
            int st =k.num;
            if(st==end) {
            	System.out.println(p[end]);//최단거리 출력
            	System.out.println(k.cnt);
            	for(int i:k.arr) {
            		System.out.print(i+" ");
            	}
            	break bre;//도착점에 도착하면 나머진 뽑을 필요 없어 멈춰!
            }
            visited[st]=true;
            for(node a:arr[st]) {//정점을 하나 뽑아서  그 정점의 현재 최단거리와 (현재 위치 가중치 + 이번 간선의 가중치) 비교
                if(!visited[a.ed]&&p[a.ed]>p[st]+a.w) {                    
                    p[a.ed]=p[st]+a.w;
//                    from[st]=a.ed;
                    ArrayList<Integer> road2 = (ArrayList<Integer>)k.arr.clone();
                    road2.add(a.ed);
                    pq.add(new point(a.ed,p[a.ed],k.cnt+1,road2));                    
                }               
            }
        }  
//        
//        while(true) {
//        	System.out.println(end);
//        	
//        }
        
    }

}