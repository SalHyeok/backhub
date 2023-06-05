import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class btn {
		int cnt;
		int fr;
		
		public btn(int cnt, int fr) {
			super();
			this.cnt = cnt;
			this.fr = fr;
		}
		
	}
	
	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int f = sc.nextInt();
    	int s = sc.nextInt();
    	int g = sc.nextInt();
    	int u = sc.nextInt();
    	int d = sc.nextInt();
    	Queue<btn> qu = new LinkedList<>();
    	qu.add(new btn(0,s));
    	int ans=Integer.MAX_VALUE;
    	boolean [] vis = new boolean [1000001];
    	vis[s]=true;
    	if(s==g) System.out.println(0);
    	else {
    		while(!qu.isEmpty()) {
    			btn x = qu.poll();    			
    			if(x.fr+u==g) {
    				ans = x.cnt+1;
    				break;
    			}
    			if(x.fr-d==g) {
    				ans = x.cnt+1;
    				break;
    			}
    			if(x.fr+u<=f&&!vis[x.fr+u]) {
    				qu.add(new btn(x.cnt+1,x.fr+u));
    				vis[x.fr+u]=true;
    			}
    			if(x.fr-d>0&&!vis[x.fr-d]) {
    				qu.add(new btn(x.cnt+1,x.fr-d));
    				vis[x.fr-d]=true;
    			}   		
    		}
    		if(ans==Integer.MAX_VALUE) {
    			System.out.println("use the stairs");
    		}
    		else {
    			System.out.println(ans);
    		}    		
    	}
    }

}