import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class node implements Comparable<node>{
		int r,c,vis,cnt;
		
		

		public node(int r, int c, int vis, int cnt) {
			super();
			this.r = r;
			this.c = c;
			this.vis = vis;
			this.cnt = cnt;
		}



		@Override
		public int compareTo(Main.node o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cnt, o.cnt);
		}	
		
		
	}
	
	static int [] dr = {1,-1,0,0};
	static int [] dc = {0,0,1,-1};
	static int R,C,max;
	static char[][] arr;
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	R = sc.nextInt();
    	C = sc.nextInt();
    	arr= new char [R][C];
    	for(int i=0;i<R;i++) {
    		arr[i]=sc.next().toCharArray();
    	}
    	max = 1;
//    	PriorityQueue<node> pq  = new PriorityQueue<>();
//    	pq.add(new node(0,0,1<<(arr[0][0]-'A'),1));
//    	while(!pq.isEmpty()) {
//    		node x = pq.poll();
//    		if(max==R*C)break;
//    		if(max==26)break;
//    		for(int n=0;n<4;n++) {
//    			int nr = x.r+dr[n];
//    			int nc = x.c+dc[n];
//    			if(nr<0||nc<0||nr>=R||nc>=C)continue;
//    			int check = x.vis>>(arr[nr][nc]-'A');//방문할 곳의 알파벳의 비트 수만큼 vis 비트를 오른쪽 이동 첫째자리 확인용
//    			if(check%2==0) {
//    				pq.add(new node(nr,nc,x.vis|(1<<(arr[nr][nc]-'A')),x.cnt+1));//비트를 통해 방문처리 후 새롭게 추가
//    				max=x.cnt+1;
//    			}    			
//    		}
//    	}
    	dfs(0,0,1<<(arr[0][0]-'A'),1);
    	System.out.println(max);
    	
    	
    	
    	
    }
    static void dfs (int r,int c,int vis,int cnt) {
    	if(max==R*C)return;
		if(max==26)return;
		for(int n=0;n<4;n++) {
			int nr = r+dr[n];
			int nc = c+dc[n];
			if(nr<0||nc<0||nr>=R||nc>=C)continue;
			int check = vis>>(arr[nr][nc]-'A');//방문할 곳의 알파벳의 비트 수만큼 vis 비트를 오른쪽 이동 첫째자리 확인용
			if(check%2==0) {
				if(max<cnt+1)max=cnt+1;
				dfs(nr,nc,vis|(1<<(arr[nr][nc]-'A')),cnt+1);//비트를 통해 방문처리 후 새롭게 추가
				
			}    			
		}
    }

}