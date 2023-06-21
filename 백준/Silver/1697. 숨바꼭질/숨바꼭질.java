import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class pt implements Comparable<pt>{
		int cnt;
		int spot;
		
		public pt(int cnt, int spot) {
			super();
			this.cnt = cnt;
			this.spot = spot;
		}
		
		@Override
		public int compareTo(pt o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cnt, o.cnt);
		}
		
	}
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int k= sc.nextInt();
    	PriorityQueue<pt> pq = new PriorityQueue<>();
    	pq.add(new pt(0,n));
    	boolean [] vist = new boolean [200002];
    	vist[n]=true;
    	while(!pq.isEmpty()) {
    		pt x = pq.poll();
    		if(x.spot==k) {
    			System.out.println(x.cnt);
    			break;
    		}
    		if(x.spot+1==k||x.spot-1==k||x.spot*2==k) {
    			System.out.println(x.cnt+1);
    			break;
    		}
    		if(x.spot+1<=100000&&!vist[x.spot+1]) {
    			pq.add(new pt(x.cnt+1,x.spot+1));
    			vist[x.spot+1]=true;
    		}
    		if(x.spot-1>=0&&!vist[x.spot-1]) {
    			pq.add(new pt(x.cnt+1,x.spot-1));
    			vist[x.spot-1]=true;
    		}
    		if(x.spot*2<=180000&&!vist[x.spot*2]) {
    			pq.add(new pt(x.cnt+1,x.spot*2));
    			vist[x.spot*2]=true;
    		}
    		
    		
    	}
    }
   

}