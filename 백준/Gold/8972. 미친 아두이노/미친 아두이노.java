import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static int [] dr= {0,1,1,1,0,0,0,-1,-1,-1};
	static int [] dc= {0,-1,0,1,-1,0,1,-1,0,1};
	
    public static void main(String[] args) throws NumberFormatException, IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	Scanner sc = new Scanner(System.in);
    	String [] rc = br.readLine().split(" ");
    	int r = Integer.parseInt(rc[0]);
    	int c = Integer.parseInt(rc[1]);
    	char cboard [][]= new char[r][c];
    	for(int i=0;i<r;i++) {
    		cboard[i]=br.readLine().toCharArray();
    	}
    	int [][] board= new int [r][c];
    	int xr=0;
    	int xc=0;
    	Queue<Integer> qr = new LinkedList<>();
    	Queue<Integer> qc = new LinkedList<>();
    	
    	for(int i=0;i<r;i++) {
    		for(int j=0;j<c;j++) {
    			if(cboard[i][j]=='I') {
    				board[i][j]=1;
    				xr=i;
    				xc=j;
    			}
    			else if(cboard[i][j]=='R') {
    				board[i][j]=2;
    				qr.add(i);
    				qc.add(j);
    			}
    		}
    	}
    	char [] move=br.readLine().toCharArray();
    	boolean check=false;
    	all:for(int t=1;t<=move.length;t++) {
    		int [][] newboard= new int [r][c];
    		xr=xr+dr[move[t-1]-'0'];
    		xc=xc+dc[move[t-1]-'0'];//첫번째 움직임
    		if(board[xr][xc]==2) {
    			System.out.println("kraj "+t);
    			check=true;
    			break all;
    		}//2
    		newboard[xr][xc]=1;
    		while(!qr.isEmpty()) {
    			int mr =qr.poll();
    			int mc =qc.poll();
    			if(mr>xr) {
    				mr--;
    			}
    			else if(mr<xr) {
    				mr++;
    			}
    			if(mc>xc) {
    				mc--;
    			}
    			else if(mc<xc) {
    				mc++;
    			}//3
    			if(newboard[mr][mc]==1) {
    				System.out.println("kraj "+t);
    				check=true;
        			break all;//4
    			}
    			else if(newboard[mr][mc]==2||newboard[mr][mc]==-1) {
    				newboard[mr][mc]=-1;    				
    			}
    			else {
    				newboard[mr][mc]=2;    				
    			}
    		}
    		board= new int [r][c];
    		for(int i=0;i<r;i++) {
        		for(int j=0;j<c;j++) {
        			if(newboard[i][j]==1) {
        				board[i][j]=1;
        				xr=i;
        				xc=j;
        			}
        			else if(newboard[i][j]==2) {
        				board[i][j]=2;
        				qr.add(i);
        				qc.add(j);
        			}
        		}
        	}
    		//5    		
    	}
    	if(!check) {
    		for(int i=0;i<r;i++) {
        		for(int j=0;j<c;j++) {
        			if(board[i][j]==1) {
        				System.out.print("I");
        			}
        			else if(board[i][j]==2) {
        				System.out.print("R");
        			}
        			else {
        				System.out.print(".");
        			}
        		}
        		System.out.println();
        	}
    	}
    	
    	
    }
   

}