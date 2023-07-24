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
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> qu = new LinkedList<>();
        for(int i=1;i<=n;i++) {
        	qu.add(i);
        }
        System.out.print("<");
        while(qu.size()!=1) {
        	for(int i=0;i<k-1;i++) {
        		qu.add(qu.poll());
        	}
        	System.out.print(qu.poll()+", ");
        }
        System.out.print(qu.poll());
        System.out.println(">");
        
        
    }
   
    
    
    
    
    
    
    

}