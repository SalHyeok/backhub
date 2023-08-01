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
		String [] nmb = br.readLine().split(" ");
		int n = Integer.parseInt(nmb[0]);
		int m = Integer.parseInt(nmb[1]);
		int b = Integer.parseInt(nmb[2]);
		int [][] ground = new int [n][m];
		int max =0;
		for(int i=0;i<n;i++) {
			String [] arr = br.readLine().split(" ");
			for(int j=0;j<m;j++) {
				ground[i][j]=Integer.parseInt(arr[j]);
				max = Math.max(max, ground[i][j]);
			}
		}
		int min = Integer.MAX_VALUE;
		int minh = 0;
		for(int h=0;h<=max;h++) {
			int ib =b;
			int time=0;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(ground[i][j]>h) {
						ib=ground[i][j]-h+ib;
						time= time+2*(ground[i][j]-h);
					}
					else {
						ib=ib-(h-ground[i][j]);
						time= time+h-ground[i][j];
					}
				}
			}
			if(ib>=0&&min>=time) {
				minh=h;
				min= time;
			}
		}
		System.out.println(min+" "+minh);

				
		
		
	}
	
	
	


}