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
    static int n;
    static int k;
    static int [] w;
    static int cnt;
     
    
    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        n =sc.nextInt();
        k =sc.nextInt();
        w = new int [n];
        for(int i=0;i<n;i++) {
        	w[i]=sc.nextInt();
        }
        cnt =0;
        check(new boolean[n],0,0);
        System.out.println(cnt);
        
        
        
    }
    static void check(boolean[]arr,int wt,int a) {
    	for(int i=0;i<n;i++) {
    		if(arr[i])continue;
    		if(wt-k+w[i]>=0) {
    			arr[i]=true;
    			check(arr,wt-k+w[i],a+1);
    			arr[i]=false;
    		}    		
    	}
    	if(a==n)cnt++;
    	return;
    }
    
    
    
    
    
    
    

}