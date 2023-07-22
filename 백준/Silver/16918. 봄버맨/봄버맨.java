import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dr= {-1,0,1,0};
    static int[] dc= {0,1,0,-1};
    
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] RCN = br.readLine().split(" ");
        int r = Integer.parseInt(RCN[0]);
        int c = Integer.parseInt(RCN[1]);
        int n = Integer.parseInt(RCN[2]);
        
        char [][] map = new char[r][c];
        int [][] timemap = new int[r][c];
        for(int i=0;i<r;i++) {
        	map[i]=br.readLine().toCharArray();        	
        }
        //8000000
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		if(map[i][j]=='.') {
        			timemap[i][j]=-1;
        		}
        		else {
        			timemap[i][j]=0;
        		}
        	}
        }
        //처음 1초
        for(int t=2;t<=n;t++) {
        	if(t%2==0) {
        		for(int i=0;i<r;i++) {
                	for(int j=0;j<c;j++) {
                		if(map[i][j]=='.') {
                			map[i][j]='O';
                			timemap[i][j]=t;
                		}                		
                	}
                }
        	}//3
        	else { //4
        		boolean [][] boommap = new boolean[r][c];
        		for(int i=0;i<r;i++) {
                	for(int j=0;j<c;j++) {
                		if(timemap[i][j]==t-3) {
                			boommap[i][j]=true;
                			for(int d=0;d<4;d++) {
                				int nr = i +dr[d];
                				int nc = j +dc[d];
                				if(nr<0|nc<0||nr>=r||nc>=c)continue;
                				boommap[nr][nc]=true;
                			}
                		}                		
                	}
                	
                }
        		for(int i=0;i<r;i++) {
                	for(int j=0;j<c;j++) {
                		if(boommap[i][j]) {
                			map[i][j]='.';
                		}                		
                	}
                }
        	}
        }
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		System.out.print(map[i][j]);                		
        	}
        	System.out.println();
        } 
        
    }
    
    
    
    
    
    
    

}