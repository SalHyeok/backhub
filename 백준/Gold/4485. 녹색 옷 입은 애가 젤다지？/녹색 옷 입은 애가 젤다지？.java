import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class Main {    
    static int [] dx = {0,0,-1,1};
    static int [] dy = {1,-1,0,0};
    static int N;
    static int [][]map;
    static int [][]shortcut;
    static boolean [][] visited;
    static class xxyy implements Comparable<xxyy>{
        int x,y,w;

        public xxyy(int x, int y, int w) {
            super();
            this.x = x;
            this.y = y;
            this.w = w;
        }

        @Override
        public int compareTo(xxyy o) {
            // TODO Auto-generated method stub
            return Integer.compare(this.w, o.w);
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int T = sc.nextInt();
        for(int t=1;;t++) {
            N = sc.nextInt();//정점 갯수
            if(N==0) break;
            map = new int [N][N];
            for(int i=0;i<N;i++) {
                for(int j=0;j<N;j++) {
                    map[i][j]=sc.nextInt();
                }
            }
            shortcut= new int [N][N];
            for(int i=0;i<N;i++) {
                Arrays.fill(shortcut[i], Integer.MAX_VALUE);
            }
            shortcut[0][0]=map[0][0];
            visited = new boolean[N][N];
            pq = new PriorityQueue<>();
            
            daic(new xxyy(0,0,map[0][0]));
            System.out.println("Problem "+t+": "+shortcut[N-1][N-1]);
            
        }    
    }    
    
    static PriorityQueue<xxyy> pq;
    static void daic (xxyy start) {
        for(int d=0;d<4;d++) {
            int nx =start.x+dx[d];
            int ny =start.y+dy[d];
            if(nx>=0&&ny>=0&&nx<N&&ny<N&&!visited[nx][ny]&&shortcut[nx][ny]>shortcut[start.x][start.y]+map[nx][ny]) {
                visited[nx][ny]=true;
                shortcut[nx][ny]=shortcut[start.x][start.y]+map[nx][ny];
                xxyy nxxyy =new xxyy(nx,ny,shortcut[nx][ny]);
                pq.add(nxxyy);
            }
        }
        stp:while(!pq.isEmpty()) {
            xxyy move = pq.poll();
            for(int d=0;d<4;d++) {
                int nx =move.x+dx[d];
                int ny =move.y+dy[d];
                if(nx>=0&&ny>=0&&nx<N&&ny<N&&!visited[nx][ny]&&shortcut[nx][ny]>shortcut[move.x][move.y]+map[nx][ny]) {
                    visited[nx][ny]=true;
                    shortcut[nx][ny]=shortcut[move.x][move.y]+map[nx][ny];
                    if(nx==N-1&&ny==N-1)break stp;
                    xxyy nxxyy =new xxyy(nx,ny,shortcut[nx][ny]);
                    pq.add(nxxyy);
                }
            }
        }
        
        
    }
}