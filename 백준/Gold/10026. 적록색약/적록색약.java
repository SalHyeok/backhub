

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static char [][] arr;
	static boolean [][] vis;
	static boolean [][] vis2;
	static int n,m;
	static int [] dr = {0,0,-1,1};
	static int [] dc = {-1,1,0,0};
	static int cnt,cnt2;
	static Queue<spot> qu;
	static class spot {
		int i,j;
		char c;
		
		public spot( int i, int j, char c) {			
			this.i = i;
			this.j = j;
			this.c = c;
		}

		
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=Integer.parseInt(br.readLine());
		arr = new char [n][n];
		cnt =0;
		cnt2 =0;
		vis = new boolean [n][n];
		
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine().toCharArray();
		}
		qu = new LinkedList<>();
		
		while(check()) {
			while(!qu.isEmpty()) {
				spot x = qu.poll();
				for(int d=0;d<4;d++) {
					int nr = x.i+dr[d];
					int nc = x.j+dc[d];
					if(nr<0||nc<0||nr>=n||nc>=n||vis[nr][nc]||arr[nr][nc]!=arr[x.i][x.j])continue;
					vis[nr][nc]=true;
					qu.add(new spot(nr,nc,arr[nr][nc]));
				}
			}
			cnt++;
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]=='G')arr[i][j]='R';
			}
		}
		vis = new boolean [n][n];
		while(check()) {
			while(!qu.isEmpty()) {
				spot x = qu.poll();
				for(int d=0;d<4;d++) {
					int nr = x.i+dr[d];
					int nc = x.j+dc[d];
					if(nr<0||nc<0||nr>=n||nc>=n||vis[nr][nc]||arr[nr][nc]!=arr[x.i][x.j])continue;
					vis[nr][nc]=true;
					qu.add(new spot(nr,nc,arr[nr][nc]));
				}
			}
			cnt2++;
		}
		
		System.out.println(cnt+" "+cnt2);
		
	}
	
	
	private static boolean check() {
		for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(!vis[i][j]) {
						vis[i][j]=true;
						qu.add(new spot(i,j,arr[i][j]));
						return true;
					}
				}
			}
		return false;
	}
	
	
	
	

}
