import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
    	int max = sc.nextInt();
    	int ans=0;
    	for(int i=1;i<n;i++) {
    		int a= sc.nextInt();
    		if(a<max)continue;
    		else {
    			pq.add(a);
    		}
    	}
    	
    	while(!pq.isEmpty()) {
    		int x = pq.poll();
    		if(x<max)break;
    		max++;
    		ans++;
    		pq.add(x-1);
    	}
    	System.out.println(ans);
    	
    	
    	
    	
    }
   

}