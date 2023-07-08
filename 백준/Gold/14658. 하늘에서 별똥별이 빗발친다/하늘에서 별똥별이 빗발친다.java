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
    	String[] nmlk =br.readLine().split(" "); 
    	int n =Integer.parseInt(nmlk[0]);
    	int m =Integer.parseInt(nmlk[1]);
    	int l =Integer.parseInt(nmlk[2]);
    	int k =Integer.parseInt(nmlk[3]);
    	int [] arrx = new int [k];
    	int [] arry = new int [k];
    	for(int i=0;i<k;i++) {
    		String [] xy = br.readLine().split(" ");
    		arrx[i]=Integer.parseInt(xy[0]);
    		arry[i]=Integer.parseInt(xy[1]);
    	}
    	int min = Integer.MAX_VALUE;
    	for(int ti=0;ti<k;ti++) {
    		for(int tj=0;tj<k;tj++) {
    			int cnt=0;
    			for(int i=0;i<k;i++) {
    				if(arrx[ti]<=arrx[i]&&arrx[ti]+l>=arrx[i]&&arry[tj]<=arry[i]&&arry[tj]+l>=arry[i]) {
    					continue;
    				}
    				else cnt++;
    			}
    			min=Math.min(min, cnt);
    		}
    	}
    	System.out.println(min);
    	
    	
    }
   

}