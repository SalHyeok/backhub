import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) throws NumberFormatException, IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	Scanner sc = new Scanner(System.in);
    	int T = Integer.parseInt(br.readLine());
    	for(int tc=0;tc<T;tc++) {
    		String [] stickn =br.readLine().split(" ");
    		int stick =Integer.parseInt(stickn[0]);
    		int n = Integer.parseInt(stickn[1]);
    		int max=0;
    		int min=0;
    		
    		for(int i=0;i<n;i++) {
    			int ant =Integer.parseInt(br.readLine());
    			int maxant =Math.max(ant, stick-ant);
    			int minant =Math.min(ant, stick-ant);
    			max=Math.max(maxant, max);
    			min=Math.max(minant, min);    			
    		}
    		System.out.println(min+" "+max);
    		
    	}
    	
    	
    }
   

}