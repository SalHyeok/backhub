


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {    	
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int [] arr = new int[n+1];
    	int [] ans = new int [n+1];
    	for(int i=1;i<=n;i++) {
    		arr[i]=sc.nextInt();    		
    	}
    	for(int i=1;i<=n;i++) {    		
    		for(int j=1;j<=n;j++) {
    			if(arr[i]==0&&ans[j]==0) {
    				ans[j]=i;
    				break;
    			}
    			if(ans[j]==0) {
    				arr[i]--;    				
    			}
    		}
    	}
    	for(int i=1;i<=n;i++) {    		
    		System.out.print(ans[i]+" ");
    	}
    }
   

}