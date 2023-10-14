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
    


    
    
    static char [][]arr;
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        arr = new char [n][m];
        for(int i=0;i<n;i++) {
        	arr[i]=br.readLine().toCharArray();
        }
        int cnt =0;
        for(int i=1;i<=Math.max(n, m);i++) {
        	if(n-i>=0) {//가장자리 줄부터 뒤집기
        		for(int j=m-i;j>=0;j--) {
        			if(arr[n-i][j]=='1') {
        				cnt++;
        				back(n-i,j);
        			}
        		}
        	}
        	if(m-i>=0) {
        		for(int j=n-i;j>=0;j--) {
        			if(arr[j][m-i]=='1') {
        				cnt++;
        				back(j,m-i);
        			}
        		}
        	}
        }
        System.out.println(cnt);
        
        
        
    }
	private static void back(int n, int m) {
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=m;j++) {
				if(arr[i][j]=='0') {
					arr[i][j]='1';
				}
				else {
					arr[i][j]='0';
				}
				
			}
		}
		
	}
    


	
}