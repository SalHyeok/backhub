import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	static class node implements Comparable<node>{
		int st;//출발점
		int second;//두번째 도착점
		int w;//현재까지 비용
		int pnt;//현재 위치
		
		public node(int st,int second, int w, int pnt) {
			super();
			this.st=st;
			this.second = second;
			this.w = w;
			this.pnt = pnt;
		}

		@Override
		public int compareTo(Main.node o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.w, o.w);
		}	
		
		
	}
	
	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int [][] link = new int [n+1][n+1];
    	int [][] ans = new int [n+1][n+1];
    	
    	for(int i=1;i<=n;i++) {
    		Arrays.fill(link[i], Integer.MAX_VALUE); 
    	}//최댓값으로 채워서 최솟값으로 갱신하려고
    	PriorityQueue<node> pq = new PriorityQueue<>();
    	for(int i=0;i<m;i++) {
    		int st = sc.nextInt();
    		int ed = sc.nextInt();
    		int pc = sc.nextInt();
    		link[st][ed]=pc;
    		link[ed][st]=pc;
    		//링크에 최소 비용 저장
    		ans[st][ed]=ed;
    		ans[ed][st]=st;
    		//ans에 현재상태에서 답 저장
    		pq.add(new node(st,ed,pc,ed));
    		pq.add(new node(ed,st,pc,st));
    		//pq에 첫 움직임은 다 저장 그래야 두번째를 저장할 수 있어서    		
    		
    	}
    	while(!pq.isEmpty()) {
    		node x = pq.poll();
    		for(int i=1;i<=n;i++) {//현재 위치와 연결된 모든 노드들 검사
    			if(link[x.pnt][i]==Integer.MAX_VALUE)continue;//연결 안되어 있는 애들 스킵
    			if(x.w+link[x.pnt][i]<link[x.st][i]) {//더 짧게 연결되어 있는 애들을 발견하면
    				link[x.st][i]=x.w+link[x.pnt][i];//링크 재할당
    				ans[x.st][i]=x.second;//정답 재할당
    				pq.add(new node(x.st,x.second,link[x.st][i],i));//pq에 넣기
    			}
    		}    		
    	}
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
    			if(i==j) {
    				System.out.print("- ");
    			}
    			else {
    				System.out.print(ans[i][j]+" ");
    			}
    		}
    		System.out.println();
    	}    	
    	
    	
    	
    	
    }

}