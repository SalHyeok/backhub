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
		String [] nm = br.readLine().split(" ");
		int n =Integer.parseInt(nm[0]);
		int m =Integer.parseInt(nm[1]);
		char [][] arr = new char [n][m];
		for(int i=0;i<n;i++) {
			arr[i]=br.readLine().toCharArray();
		}
		int cnt =0;
		for(int i=0;i<n;i++) {
			boolean chk =false;			
			for(int j=0;j<m;j++) {
				if(arr[i][j]=='-'&&!chk) {
					chk=true;
					cnt++;
				}
				else if(arr[i][j]=='|') {
					chk=false;
				}
			}
		}
		for(int j=0;j<m;j++) {
			boolean chk =false;			
			for(int i=0;i<n;i++) {
				if(arr[i][j]=='|'&&!chk) {
					chk=true;
					cnt++;
				}
				else if(arr[i][j]=='-') {
					chk=false;
				}
			}
		}
		System.out.println(cnt);
	}
	
	
	


}