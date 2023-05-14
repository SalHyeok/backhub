import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main {
    static int [] p;//대표 저장 배열
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        int V = sc.nextInt();//정점 갯수
        double [] xx = new double [V];
        double [] yy = new double [V];
        for(int i=0;i<V;i++) {
        	xx[i]=sc.nextDouble();
        	yy[i]=sc.nextDouble();
        }
        int E = V*(V-1)/2;//간선              
        //간선을 저장하기 위해서 클래스를 사용할 수 도 있음
        //배열 이용하여 저장을 하겠다 0:시작정점 /1: 끝정점 /2:가중치
        double [][] edges = new double [E][3];
        int idx =0;
        for(int i=0;i<V-1;i++) {
        	for(int j=i+1;j<V;j++) {
        		edges[idx][2]=Math.sqrt((xx[i]-xx[j])*(xx[i]-xx[j])+(yy[i]-yy[j])*(yy[i]-yy[j]));
        		edges[idx][0]=i;
        		edges[idx][1]=j;    
        		idx++;
        	}
        }
        
        
        
        //크루스칼 1단계
        //간선을 정렬한다.(오름차순으로)
        Arrays.sort(edges,new Comparator<double []>() {
        	@Override
        	public int compare(double[] o1, double[] o2) {
        		// TODO Auto-generated method stub
        		if((o1[2]-o2[2])>=0)return 1;
        		else return -1;                 
        	}});
        
        //크루스칼 2단계 사이클이 발생하지 않는 v-1개의 간선 뽑기
        p = new int [V];//1부터 시작하면 V+1
        //make set 하자 . 나 자신을 대표로 초기화
        for(int i=0;i<V;i++) {
        	makeset(i);
        }//메이크셋 완료
        
        double ans =0;//최소 비용을 저장
        int pick =0;//내가 뽑은거
        //모든 간선을 일단 순회하면서 쳌ㅋ
        //while로 해보기???
        for(int i=0;i<E;i++) {
        	//i번째의 간선을 뽑아 두 정점의 대표를 확인하겠다.          
//          int x=edges[i][0];
//          int y=edges[i][0];
        	int px = findset((int)edges[i][0]);
        	int py =findset((int)edges[i][1]);
        	
        	if(px!=py) {
        		union(px,py);
        		pick++;
        		ans+=edges[i][2];               
        	}           
        	if(pick==V-1)break;
        }
        
        System.out.println(ans);
        
         
         
         
         
         
         
         
         
         
         
         
         
         
    }   
    static void makeset(int x) {
        p[x]=x;
    }
    static int findset(int x) {
//      if(x==p[x])return x;
//      return findset(p[x]);//기본
//      
        if(x!=p[x])
            p[x] = findset(p[x]);
        return p[x]; //빠르게 하는거 패스 컴프레션
    }
    static void union(int x,int y) {
//      p[findset(y)]=findset(x);//랭크같은거 고려안하고 무조건 와이 밑으로 엑스
        p[y]=x;//왜 이게 되는지는 이해하고 알고 쓸것
         
    }
}