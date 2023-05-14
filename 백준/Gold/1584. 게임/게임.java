import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class spot implements Comparable<spot>{
		int x,y,p;

		public spot(int x, int y, int p) {
			super();
			this.x = x;
			this.y = y;
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
		
		int N = Integer.parseInt(br.readLine());		
		int [][] visit = new int [501][501];
		
		for(int i=0;i<N;i++) {			
			String [] danger = br.readLine().split(" ");
			int ax1 =Integer.parseInt(danger[0]);
			int ay1 =Integer.parseInt(danger[1]);
			int ax2 =Integer.parseInt(danger[2]);
			int ay2 =Integer.parseInt(danger[3]);
			int x1 = Math.min(ax1, ax2);
			int y1 = Math.min(ay1, ay2);
			int x2 = Math.max(ax1, ax2);
			int y2 = Math.max(ay1, ay2);
			for(int x=x1;x<=x2;x++) {
				for(int y=y1;y<=y2;y++) {
					visit[x][y]=1;
				}
			}
		}
		int D = Integer.parseInt(br.readLine());		
		for(int i=0;i<D;i++) {			
			String [] danger = br.readLine().split(" ");
			int ax1 =Integer.parseInt(danger[0]);
			int ay1 =Integer.parseInt(danger[1]);
			int ax2 =Integer.parseInt(danger[2]);
			int ay2 =Integer.parseInt(danger[3]);
			int x1 = Math.min(ax1, ax2);
			int y1 = Math.min(ay1, ay2);
			int x2 = Math.max(ax1, ax2);
			int y2 = Math.max(ay1, ay2);
			for(int x=x1;x<=x2;x++) {
				for(int y=y1;y<=y2;y++) {
					visit[x][y]=-1;
				}
			}			
		}
		PriorityQueue<spot> pq = new PriorityQueue<>();		
		int [][] wp = new int [501][501];
		for(int i=0;i<501;i++) {
			Arrays.fill(wp[i], Integer.MAX_VALUE);
		}
		wp[0][0]=0;
		visit[0][0]=0;
		pq.add(new spot(0,0,0));
		int [] dx = {-1,1,0,0};
		int [] dy = {0,0,-1,1};
		while(!pq.isEmpty()) {
			spot X = pq.poll();
			if(X.x==500&&X.y==500)break;
			if (visit[X.x][X.y]==-1) continue;
			visit[X.x][X.y]=-1;			
			for(int d=0;d<4;d++) {
				int nx = X.x+dx[d];
				int ny = X.y+dy[d];
				if(nx<0||ny<0||nx>500||ny>500||visit[nx][ny]==-1||wp[nx][ny]<=X.p+visit[nx][ny])continue;
				wp[nx][ny]=X.p+visit[nx][ny];
				pq.add(new spot(nx,ny,wp[nx][ny]));				
			}
		}
		if(wp[500][500]==Integer.MAX_VALUE) {
			System.out.println(-1);
		}
		else {
			System.out.println(wp[500][500]);
		}
		
	}

}