//불리언 통해서  이전 위치 확인하기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;



public class Main {
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
//		Scanner sc = new Scanner (System.in);
		
		int n = Integer.parseInt(br.readLine());
		if(n>=3) {
			int [][] arr = new int [3][n];
			int x0 =Integer.parseInt(br.readLine());
			int x1 =Integer.parseInt(br.readLine());
			int x2 =Integer.parseInt(br.readLine());
			arr[0][0]=0;
			arr[1][0]=x0;
			arr[2][0]=x0;
			arr[0][1]=x0;
			arr[1][1]=x1;
			arr[2][1]=x0+x1;
			arr[0][2]=Math.max(arr[1][1], arr[2][1]);
			arr[1][2]=arr[0][1]+x2;
			arr[2][2]=arr[1][1]+x2;
			for(int i=3;i<n;i++) {
				int x=Integer.parseInt(br.readLine());
				arr[0][i]=Math.max(arr[1][i-1], arr[2][i-1]);
				arr[1][i]=arr[0][i-1]+x;
				arr[2][i]=arr[1][i-1]+x;
			}
			System.out.println((int)Math.max(arr[1][n-1], arr[2][n-1]));			
		}
		else {
			int sum =0;
			for(int i=0;i<n;i++) {
				sum+=Integer.parseInt(br.readLine());				
			}
			System.out.println(sum);
		}
		

				
		
		
	}
	
	
	


}