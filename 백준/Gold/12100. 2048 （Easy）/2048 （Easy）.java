//불리언 통해서  이전 위치 확인하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int max,n;
	
	static class move {
		int nowmax;
		int [][] mapx;
		int cnt;
		public move(int nowmax, int[][] mapx, int cnt) {
			super();
			this.nowmax = nowmax;
			this.mapx = mapx;
			this.cnt = cnt;
		}		
		
	}
	static move up (move a) {
		int [][] newmap = new int [n][n];
		for(int i=0;i<n;i++) {
			newmap[i]=a.mapx[i].clone();
		}
		int last =0;
		boolean chk =false;
		for(int j=0;j<n;j++) {
			Queue<Integer> qu = new LinkedList<>();
			for(int i=0;i<n;i++) {
				if(a.mapx[i][j]==0)continue;
				qu.add(a.mapx[i][j]);
				
			}
			for(int i=0;i<n;i++) {
				if(qu.isEmpty()) {
					newmap[i][j]=0;
				}
				else {
					int d = qu.poll();
					if(!qu.isEmpty()&&qu.peek()==d) {
						newmap[i][j]=qu.poll()*2;
						max=Math.max(max, d*2);
					}
					else {
						newmap[i][j]=d;
					}
				}
				
			}
		}
		return new move(max,newmap,a.cnt+1);
	}
	static move down (move a) {
		int [][] newmap = new int [n][n];
		for(int i=0;i<n;i++) {
			newmap[i]=a.mapx[i].clone();
		}
		int last =0;
		boolean chk =false;
		for(int j=0;j<n;j++) {
			Queue<Integer> qu = new LinkedList<>();
			for(int i=n-1;i>=0;i--) {
				if(a.mapx[i][j]==0)continue;
				qu.add(a.mapx[i][j]);			
			}
			for(int i=n-1;i>=0;i--) {
				if(qu.isEmpty()) {
					newmap[i][j]=0;
				}
				else {
					int d = qu.poll();
					if(!qu.isEmpty()&&qu.peek()==d) {
						newmap[i][j]=qu.poll()*2;
						max=Math.max(max, d*2);
					}
					else {
						newmap[i][j]=d;
					}
				}
				
			}
			
		}
		return new move(max,newmap,a.cnt+1);
	}
	static move left (move a) {
		int [][] newmap = new int [n][n];
		for(int i=0;i<n;i++) {
			newmap[i]=a.mapx[i].clone();
		}
		int last =0;
		boolean chk =false;
		for(int i=0;i<n;i++) {
			Queue<Integer> qu = new LinkedList<>();
			for(int j=0;j<n;j++) {
				if(a.mapx[i][j]==0)continue;
				qu.add(a.mapx[i][j]);
				
			}
			for(int j=0;j<n;j++) {
				if(qu.isEmpty()) {
					newmap[i][j]=0;
				}
				else {
					int d = qu.poll();
					if(!qu.isEmpty()&&qu.peek()==d) {
						newmap[i][j]=qu.poll()*2;
						max=Math.max(max, d*2);
					}
					else {
						newmap[i][j]=d;
					}
				}
				
			}
		}
		return new move(max,newmap,a.cnt+1);
	}
	static move right (move a) {
		int [][] newmap = new int [n][n];
		for(int i=0;i<n;i++) {
			newmap[i]=a.mapx[i].clone();
		}
		int last =0;
		boolean chk =false;
		for(int i=0;i<n;i++) {
			Queue<Integer> qu = new LinkedList<>();
			for(int j=n-1;j>=0;j--) {
				if(a.mapx[i][j]==0)continue;
				qu.add(a.mapx[i][j]);			
			}
			for(int j=n-1;j>=0;j--) {
				if(qu.isEmpty()) {
					newmap[i][j]=0;
				}
				else {
					int d = qu.poll();
					if(!qu.isEmpty()&&qu.peek()==d) {
						newmap[i][j]=qu.poll()*2;
						max=Math.max(max, d*2);
					}
					else {
						newmap[i][j]=d;
					}
				}
				
			}
		}
		return new move(max,newmap,a.cnt+1);
	}
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int [][] map = new int [n][n];
		max =0;
		for(int i=0;i<n;i++) {
			String [] arr = br.readLine().split(" ");
			for(int j=0;j<n;j++) {
				map[i][j]=Integer.parseInt(arr[j]);
				max =Math.max(map[i][j], max);
			}			
		}
		Queue<move> qu = new LinkedList<>();
		qu.add(new move(max,map,0));
		while(!qu.isEmpty()) {
			move x = qu.poll();
//			for(int i=0;i<n;i++) {
//				for(int j=0;j<n;j++) {
//					System.out.print(x.mapx[i][j]+" "); 
//				}
//				System.out.println();
//			}
//			System.out.println();
			if(x.cnt==5)break;
			move [] arx = new move [4];
			arx[0] = up(x);
			arx[1] = down(x);
			arx[2] = left(x);
			arx[3] = right(x);
			for(int i=0;i<4;i++) {
				if(arx[i].nowmax*Math.pow(2,(5-arx[i].cnt))<max) continue;
				qu.add(arx[i]);
			}
		}
		System.out.println(max);
		
		
		
		
		
	}
	
	
	
	
//4
//2 32 16 8
//4 0 4 4
//0 1 8 4
//32 32 0 32
	
	

}