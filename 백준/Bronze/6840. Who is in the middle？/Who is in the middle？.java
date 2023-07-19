import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
   
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        pq.add(sc.nextInt());
        
        pq.poll();
        System.out.println(pq.poll());
        
        
        
        
        
    }
    
    
    
    
    
    
    

}