


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {    	
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k = sc.nextInt();
    	int [] btcnt=new int [100];
    	int cnt =n;
    	btcnt[0]=n;
    	int ans =0;
    	while(true) {
    		for(int i=0;i<100;i++) {
    			if(btcnt[i]>1) {
    				cnt= cnt-btcnt[i]+(btcnt[i]/2)+(btcnt[i]%2);
    				btcnt[i+1]=btcnt[i+1]+(btcnt[i]/2);
    				btcnt[i]=btcnt[i]%2;     				
    			}
    		}
    		if(k>=cnt)break;
    		btcnt[0]++;
    		cnt++;
    		ans++;
    		
    	}
    	System.out.println(ans);
    }
   

}