import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int[] dr= {-1,0,1,0};
    static int[] dc= {0,1,0,-1};
    
     
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int cnt =0;
        for(int i=0;i<n;i++) {
        	String [] xy =br.readLine().split(" ");
//        	int x = Integer.parseInt(xy[0]);
        	int y = Integer.parseInt(xy[1]);
        	if(y==0) {
        		st.clear();
        		continue;
        	}
        	if(st.isEmpty()) {
        		st.push(y);
        		cnt++;
        	}
        	else if(st.peek()<y) {
        		st.push(y);
        		cnt++;
        	}
        	else {
        		while(!st.isEmpty()&&st.peek()>y) {
        			st.pop();
        		}
        		if(st.isEmpty()||st.peek()<y) {
        			st.push(y);
            		cnt++;
        		}        		
        	}
        	
        	
        	
        }
        System.out.println(cnt);
        
        
        
    }
   
    
    
    
    
    
    
    

}