import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
//    static int[] dr = {-1, 0, 0, 1};
//    static int[] dc = {0, -1, 1, 0};
    


    static class spot{
    	int num,cnt;

		public spot(int num, int cnt) {			
			this.num = num;
			this.cnt = cnt;
		}
    	
    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean [] arr = new boolean [n+1];
        for(int i=0;i<m;i++) {
        	int str = sc.nextInt();
        	int end = sc.nextInt();
        	for(;str<=end;str++) {
        		if(!arr[str])arr[str]=true;
        	}
        }
        Queue<spot> qu = new LinkedList<>();
        qu.add(new spot(0,0));
        int ans =-1;
        while(!qu.isEmpty()) {
        	spot x = qu.poll();
        	if(x.num+a==n) {
        		ans = x.cnt+1;
        		break;
        	}
        	if(x.num+b==n) {
        		ans = x.cnt+1;
        		break;
        	}
        	if(x.num+a<n&&!arr[x.num+a]) {
        		qu.add(new spot(x.num+a,x.cnt+1));
        		arr[x.num+a]=true;
        	}
        	if(x.num+b<n&&!arr[x.num+b]) {
        		qu.add(new spot(x.num+b,x.cnt+1));
        		arr[x.num+b]=true;
        	}
        }
        System.out.println(ans);
        
        
        
        
        
        
    }


	
}