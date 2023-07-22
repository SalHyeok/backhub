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
    
    
    public static void main(String[] args) throws NumberFormatException, IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int k =sc.nextInt();
//        System.out.println(Math.pow(2, 20));
        boolean [] pow = new boolean [22];
        for(int i=21;i>=0;i--) {
        	if(Math.pow(2, i)<=k) {
        		pow[i]=true;
        		k=k-(int)Math.pow(2, i);
        	}
        }
        int size =0;
        
        for(int i=21;i>=0;i--) {
        	if(pow[i]) {
        		size = i+1;
        		break;
        	}
        }
        for(int i=0;i<22;i++) {
        	if(pow[i]) {
        		
        		if(size-1==i) {
        			System.out.println((int)(Math.pow(2, size-1))+" "+0);
        		}
        		else {
        			System.out.println((int)(Math.pow(2, size))+" "+(size-i));
        		}
        		
        		break;
        	}
        }
        
        
        
    }
    
    
    
    
    
    
    

}