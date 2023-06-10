import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class node implements Comparable<node>{
		int num;
		int plus;

		public node(int num, int plus) {
			super();
			this.num = num;
			this.plus = plus;
		}

		@Override
		public int compareTo(node o) {
			// TODO Auto-generated method stub
			if(this.plus==o.plus) {
				return Integer.compare(this.num, o.num);
			}
			return Integer.compare(this.plus, o.plus);
		}
		
	}
	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	PriorityQueue<node> pq =new PriorityQueue<>(); 
    	for(int i=0;i<n;i++) {
    		int a= sc.nextInt();
    		if(a==0) {
    			if(pq.isEmpty()) {
    				System.out.println(0);
    			}
    			else {
    				System.out.println(pq.poll().num);
    			}
    		}
    		else {
    			pq.add(new node(a,Math.abs(a)));
    			
    		}
    	}
    	
    	
    	
    }
   

}