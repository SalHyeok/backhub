import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1,1,1,-1,-1};
    static int[] dc = {0, -1, 1, 0,1,-1,1,-1};
    


    
    
    static int [][]arr;
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int [][] map = new int [n][m];
        for(int i=0;i<n;i++) {
        	String [] nn = br.readLine().split(" ");
        	for(int j=0;j<m;j++) {
        		map[i][j]=Integer.parseInt(nn[j]);
        	}
        }
        int ans =0;
        boolean [][] check = new boolean [n][m];
        Queue<Integer> qu = new LinkedList<Integer>();
        
        for(int i=0;i<n;i++) {        	
        	for(int j=0;j<m;j++) {
        		if(check[i][j]||map[i][j]==0)continue;        		
        		qu.add(i);
        		qu.add(j);
        		boolean bong = true;
        		while(!qu.isEmpty()) {
        			int r =qu.poll();
        			int c =qu.poll();
        			if(check[r][c])continue;
        			check[r][c]=true;
        			for(int d=0;d<8;d++) {
        				int nr = r+dr[d];
        				int nc = c+dc[d];
        				if(nr>=n||nc>=m||nr<0||nc<0)continue;        				
        				if(map[nr][nc]>map[i][j]) {
        					bong =false;
        				}
        				else if(map[nr][nc]==map[i][j]) {        					
        					qu.add(nr);
        					qu.add(nc);
        				}
        				
        				
        			}
        		}
        		if(bong) {
        			
        			ans++;
        		}
        	}
        }
        System.out.println(ans);       
        
        
        
    }
    


	
}