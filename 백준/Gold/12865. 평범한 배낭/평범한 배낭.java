
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	static int n,k;
	static int [] w;
	static int [] v;
	static int [][] dp;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		k=sc.nextInt();
		w= new int [n+1];
		v= new int [n+1];
		dp = new int [n+1][k+1];
		for(int i=1;i<=n;i++) {
			w[i]=sc.nextInt();
			v[i]=sc.nextInt();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=k;j++) {
				if(j-w[i]>=0) {
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i]]+v[i]);
				}
				else {
					dp[i][j]=dp[i-1][j];//i번째 물건을 안넣을거임
				}
//				dp[i-1][j]//i번째 물건을 안넣을거임
//				dp[i-1][j-w[i]]+v[i]//i번째 물건을 넣을거임					
			}
		}
		System.out.println(dp[n][k]);
		
		
		
	}
	
	
	
	
	
	
	

}
