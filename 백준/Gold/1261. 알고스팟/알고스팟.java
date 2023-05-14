import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;



public class Main {
	static int M,N;
 	static int[][] vist;
	static char [][] map;
	static int[] dr = {0,0,-1,1};
	static int[] dc = {1,-1,0,0};

	static class spot implements Comparable<spot> {
		int r,c,p;

		public spot(int r,int c, int p) {
			super();
			this.r = r;
			this.c = c;
			this.p = p;
		}

		@Override
		public int compareTo(spot o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.p, o.p);
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] A = br.readLine().split(" ");
		M=Integer.parseInt(A[0]);
		N=Integer.parseInt(A[1]);
		vist= new int[N][M];
		map= new char [N][M];
		
		for(int i=0;i<N;i++) {
			Arrays.fill(vist[i], Integer.MAX_VALUE);
		}
		for(int i=0;i<N;i++) {
			map[i]=br.readLine().toCharArray();			
		}
		PriorityQueue<spot> pq = new PriorityQueue<>();
		pq.add(new spot(0,0,0));
		while(!pq.isEmpty()) {
			spot X = pq.poll();	
			if(X.r==N-1&&X.c==M-1) {
				System.out.println(X.p);
				break;
				}
			vist[X.r][X.c]=X.p;
			for(int d=0;d<4;d++) {
				int nr =X.r+dr[d];
				int nc =X.c+dc[d];
				if(nr<N&&nc<M&&nr>=0&&nc>=0) {
					if(map[nr][nc]=='1'&&vist[nr][nc]>X.p+1) {
						pq.add(new spot(nr,nc,X.p+1));
						vist[nr][nc]=X.p+1;
					}
					else if (map[nr][nc]=='0'&&vist[nr][nc]>X.p){
						pq.add(new spot(nr,nc,X.p));
						vist[nr][nc]=X.p;
					}
				}			
			}
		}	
	}
}