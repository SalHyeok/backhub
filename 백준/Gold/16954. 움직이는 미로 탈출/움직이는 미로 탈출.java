
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	
	static int [] dr= {0,1,-1,0,0,-1,-1,1,1};
	static int [] dc= {0,0,0,1,-1,1,-1,1,-1};
	static char[][] bd;
	static class spot{
		int cnt,i,j;

		public spot(int cnt,int i, int j) {
			this.cnt=cnt;
			this.i = i;
			this.j = j;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bd = new char[8][8];
		for(int i=0;i<8;i++) {
			bd[i]=sc.next().toCharArray();
		}
		if(check()) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		
		
	}

	static boolean check() {
		Queue<spot> qu = new LinkedList<>();
		qu.add(new spot(0,7,0));
		for(int i=0;i<8;i++) {
			if(qu.isEmpty())return false;
			while(!qu.isEmpty()) {
				if(qu.peek().cnt!=i)break;
				spot x = qu.poll();
				if(bd[x.i][x.j]=='#')continue;
				for(int d=0;d<9;d++) {
					int nr = x.i+dr[d];
					int nc = x.j+dc[d];
					if(nr<0||nc<0||nr>=8||nc>=8||bd[nr][nc]=='#')continue;
					if(nr==0&&nc==7)return true;
					qu.add(new spot(x.cnt+1,nr,nc));
				}
				
			}
			for(int j=6;j>=0;j--) {
				bd[j+1]=bd[j].clone();
			}
			for(int j=0;j<8;j++) {
				bd[0][j]='.';
			}
			
		}
		if(qu.isEmpty())return false;
		else return true;
		
	}
	
	
	
	
	
	
	

}
