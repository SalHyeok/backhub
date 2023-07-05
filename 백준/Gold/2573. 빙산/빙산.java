

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int [][] arr;
	static int n,m;
	static int [] dr = {0,0,-1,1};
	static int [] dc = {-1,1,0,0};
	static int cnt;
	static class spot {
		int i,j;

		public spot(int i, int j) {			
			this.i = i;
			this.j = j;
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int [n][m];
		cnt =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		while(mapcheck()) {
			sun();
			cnt++;						
		}
		if(cnt==-1) {
			System.out.println(0);
		}
		else {
			System.out.println(cnt);
		}
	}
	
	
	static void sun() {
		int [][] copy = new int [n][m];
		for(int i=0;i<n;i++) {
			copy[i]=arr[i].clone();			
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(copy[i][j]!=0) {
					for(int d=0;d<4;d++) {
						int nr =i+dr[d];
						int nc =j+dc[d];
						if(nr<0||nc<0||nr>=n||nc>=m||copy[nr][nc]!=0)continue;
						if(arr[i][j]>0)arr[i][j]--;						
					}
				}
			}
		}
		
	}


	static boolean mapcheck() {
		boolean[][] visit = new boolean [n][m];
		int fi =-1;
		int fj =-1; 
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]==0)continue;
				if(fi==-1) {
					fi=i;
					fj=j;
				}
				visit[i][j]=true;
			}
		}
		if(fi==-1) {
			cnt =-1;
			return false;
		}
		Queue<spot> qu = new LinkedList<>();
		visit[fi][fj]=false;
		qu.add(new spot(fi,fj));
		while(!qu.isEmpty()) {
			spot x = qu.poll();
			for(int d=0;d<4;d++) {
				int nr =x.i+dr[d];
				int nc =x.j+dc[d];
				if(nr<0||nc<0||nr>=n||nc>=m||!visit[nr][nc])continue;
				visit[nr][nc]=false;
				qu.add(new spot(nr,nc));
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(visit[i][j])return false;
			}
		}
		return true;
		
	}
	

}
