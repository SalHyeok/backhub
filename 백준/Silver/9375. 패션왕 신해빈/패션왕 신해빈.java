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
		
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			int n = Integer.parseInt(br.readLine());
			int [] num = new int [n];
			String [] wear = new String [n];
			int k =0;
			for(int i=0;i<n;i++) {
				String [] arr = br.readLine().split(" ");
				for(int j=0;j<=k;j++) {
					if(j==k) {
						wear[j]=arr[1];
						num[j]=1;
						k++;
						break;
					}
					if(wear[j].equals(arr[1])) {
						num[j]++;
						break;
					}					
				}
			}
			int ans =1;
			for(int i=0;i<k;i++) {
				if(num[i]!=0) {
					ans = ans*(num[i]+1);
				}
			}
			System.out.println(ans-1);
		}
		

				
		
		
	}
	
	
	


}