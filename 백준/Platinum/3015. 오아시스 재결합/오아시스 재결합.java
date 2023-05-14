import java.util.Scanner;
import java.util.Stack;
public class Main {
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        Stack<int[]> st =new Stack<>();
        int n= sc.nextInt();
        long sum = 0;
        for(int i=0;i<n;i++) {        	        	
        	int[] p =new int [2];
        	p[0]=sc.nextInt();        	
        	p[1]=1;
        	while(true) {        		
        		if(st.isEmpty()) {
        			st.push(p);        			
        			break;
        		}
        		else if(st.peek()[0]>p[0]) {
        			sum++;
        			st.push(p);
        			break;
        		}
        		else if(st.peek()[0]==p[0]) {
        			p[1]=st.pop()[1];
        			sum+=p[1]++;        			      			
        		}
        		else {        			
        			sum+=st.pop()[1];
        		}
        	}        	
        	
        }
        System.out.println(sum);


    }//main
}//class