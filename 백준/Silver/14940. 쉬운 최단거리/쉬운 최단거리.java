import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class node implements Comparable<node>{
		int r,c,cnt;	

		public node(int r, int c, int cnt) {
			super();
			this.r = r;
			this.c = c;			
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
	static int[][] arr,ans;
    public static void main(String[] args) throws IOException {    	
//    	Scanner sc = new Scanner(System.in);
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String [] rc = br.readLine().split(" ");
    	R = Integer.parseInt(rc[0]);
    	C = Integer.parseInt(rc[1]);
    	arr= new int [R][C];
    	ans= new int [R][C];
    	PriorityQueue<node> pq  = new PriorityQueue<>();
    	for(int i=0;i<R;i++) {
    		String [] line = br.readLine().split(" ");
    		for(int j=0;j<C;j++) {
    			arr[i][j]=Integer.parseInt(line[j]);
    			if(arr[i][j]==0) {
    				ans[i][j]=0;
    			}
    			else if(arr[i][j]==2) {
    				ans[i][j]=0;
    				pq.add(new node(i,j,0));
    			}
    			else {
    				ans[i][j]=-1;
    			}
    		}
    	}
    	
    	while(!pq.isEmpty()) {
    		node x = pq.poll();    		
    		for(int n=0;n<4;n++) {
    			int nr = x.r+dr[n];
    			int nc = x.c+dc[n];
    			if(nr<0||nc<0||nr>=R||nc>=C)continue;
    			if(ans[nr][nc]==0)continue;
    			if(ans[nr][nc]==-1) {
    				pq.add(new node(nr,nc,x.cnt+1));
    				ans[nr][nc]=x.cnt+1;
    			}
    			else if(ans[nr][nc]>x.cnt+1){
    				pq.add(new node(nr,nc,x.cnt+1));
    				ans[nr][nc]=x.cnt+1;
    			}    			
    		}
    	}
    	for(int i=0;i<R;i++) {
    		for(int j=0;j<C;j++) {
    			System.out.print(ans[i][j]+" ");
    		}
    		System.out.println();
    	}
    	
    	
    	
    	
    	
    	
    }
   

}