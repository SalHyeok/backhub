import java.util.Scanner;

public class Main {
	
	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	
    	int M = 0;
    	for(int i=0;i<t;i++) {
    		int m=0;
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int c = sc.nextInt();
    		if(a==b&&b==c) {
    			m+=10000;
    			m+=1000*a;
    		}
    		else if(a==b) {
    			m+=1000;
    			m+=100*a;
    		}else if(b==c) {
    			m+=1000;
    			m+=100*b;
    		}else if(c==a) {
    			m+=1000;
    			m+=100*a;
    		}
    		else {
    			int max =Math.max(a, b);
    			max = Math.max(max, c);
    			m+=max*100;
    		}
    		M = Math.max(m, M);
    		
    	}
    	System.out.println(M);
    }

}