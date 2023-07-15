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
	static class man implements Comparable<man>{
		int t,x;

		public man(int t, int x) {			
			this.t = t;
			this.x = x;
		}

		@Override
		public int compareTo(man o) {
			if(o.x>this.x) {
				return 1;
			}
			else if(o.x==this.x) {
				if(o.t>this.t) {
					return 1;
				}
				else return -1;
			}
			else {
				return -1;
			}
		}
		
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	Scanner sc = new Scanner(System.in);
    	int T = Integer.parseInt(br.readLine());
    	PriorityQueue<man> pq = new PriorityQueue<>();
    	int [] card=new int  [5]; 
    	for(int t=1;t<=T;t++) {
    		String [] arr = br.readLine().split(" ");
    		for(int i=0;i<5;i++) {
    			card[i]=Integer.parseInt(arr[i]);
    		}
    		int max=0;
    		for(int i=0;i<4;i++) {
    			for(int j=i+1;j<5;j++) {
    				int sum =0;
    				for(int k=0;k<5;k++) {
    					if(k!=i&&k!=j) {
    						sum+=card[k];
    					}
    				}
    				max=Math.max(max, sum%10);
    			}
    		}
    		pq.add(new man(t,max));
    		
    	}
    	System.out.println(pq.poll().t);
    	
    	
    }
   

}