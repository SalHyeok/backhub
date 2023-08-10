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
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		Scanner sc = new Scanner (System.in);
		int [] num = new int [5];
		for(int i=0;i<5;i++) {
			num[i]=sc.nextInt();
		}
		for(int i=1;;i++) {
			int cnt =0;
			for(int j=0;j<5;j++) {
				if(i%num[j]==0) {
					cnt++;
				}
			}
			if(cnt>=3) {
				System.out.println(i);
				break;
			}
		}
		
		

				
		
		
	}
	
	
	


}