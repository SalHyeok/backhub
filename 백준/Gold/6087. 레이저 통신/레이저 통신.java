import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dr= {-1,0,1,0};
    static int[] dc= {0,1,0,-1};
    static class point implements Comparable<point>{
        int x,y,ar,mr;
        

        public point(int x, int y, int ar, int mr) {            
            this.x = x;
            this.y = y;
            this.ar = ar;
            this.mr = mr;
        }


        @Override
        public int compareTo(point o) {
            // TODO Auto-generated method stub
            return Integer.compare(this.mr, o.mr);
        }
        
    }
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []WH = br.readLine().split(" ");
        int h = Integer.parseInt(WH[0]);
        int w = Integer.parseInt(WH[1]);
        char[][] map = new char[w][h];
        boolean [][][] vis = new boolean [4][w][h];        
        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i=0;i<w;i++) {
            map[i]=br.readLine().toCharArray();            
        }
        boolean check =true;
        X:for(int i=0;i<w;i++) {
            for(int j=0;j<h;j++) {                
                if(map[i][j]=='C') {
                   
                    for(int d=0;d<4;d++) {
                    	vis[d][i][j]=true;
                        int nr = dr[d]+i;
                        int nc = dc[d]+j;
                        if(nr<0||nc<0||nr>=w||nc>=h||map[nr][nc]=='*')continue;
                        if(map[nr][nc]=='C') {                            
                            System.out.println(0);
                            check =false;
                            break;
                        }                        
//                        vis[nr][nc]=true;
                        pq.add(new point(nr,nc,d,0));
                    }
                    break X;
                }
            }
        }
        while(check) {        	
            point x = pq.poll();
            if(vis[x.ar][x.x][x.y])continue;
            vis[x.ar][x.x][x.y]=true;
            if(map[x.x][x.y]=='C') {
            	System.out.println(x.mr);
            	break;
            }
//            System.out.println(x.x+" "+x.y+" "+x.mr);
            int nr = dr[x.ar]+x.x;
            int nc = dc[x.ar]+x.y;
            int nr1 = dr[(x.ar+1)%4]+x.x;
            int nc1 = dc[(x.ar+1)%4]+x.y;
            int nr2 = dr[(x.ar+3)%4]+x.x;
            int nc2 = dc[(x.ar+3)%4]+x.y;
            if(nr>=0&&nc>=0&&nr<w&&nc<h&&map[nr][nc]!='*'&&!vis[x.ar][nr][nc]) {                
                pq.add(new point(nr,nc,x.ar,x.mr));                
            }
            if(nr1>=0&&nc1>=0&&nr1<w&&nc1<h&&map[nr1][nc1]!='*'&&!vis[(x.ar+1)%4][nr1][nc1]) {
                pq.add(new point(nr1,nc1,(x.ar+1)%4,x.mr+1));                
            }
            if(nr2>=0&&nc2>=0&&nr2<w&&nc2<h&&map[nr2][nc2]!='*'&&!vis[(x.ar+3)%4][nr2][nc2]) {
                pq.add(new point(nr2,nc2,(x.ar+3)%4,x.mr+1));                
            }
            
        }
        
        
        
        
        
        
        
    }
    
    
    
    
    
    
    

}