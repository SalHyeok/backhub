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
    	int n = Integer.parseInt(br.readLine());
    	int [] arrx = new int [n];
    	int [] arry = new int [n];
    	String [] x0 = br.readLine().split(" ");
		arrx[0]=Integer.parseInt(x0[0]);
		arry[0]=Integer.parseInt(x0[1]);
		int all =0;
    	for(int i=1;i<n;i++) {
    		String [] x = br.readLine().split(" ");
    		arrx[i]=Integer.parseInt(x[0]);
    		arry[i]=Integer.parseInt(x[1]);
    		all+=Math.abs(arrx[i]-arrx[i-1])+Math.abs(arry[i]-arry[i-1]);
    	}
    	int max = 0;
    	int maxi =0;
    	for(int i=1;i<n-1;i++) {
    		int x = Math.abs(arrx[i]-arrx[i-1])+Math.abs(arry[i]-arry[i-1])+Math.abs(arrx[i+1]-arrx[i])+Math.abs(arry[i+1]-arry[i]);
    		x =x-(Math.abs(arrx[i+1]-arrx[i-1])+Math.abs(arry[i+1]-arry[i-1]));
    		if(max<x) {
    			max=x;
    			maxi=i;
    		}
    	}
    	System.out.println(all-max);
    	
    	
    }
   

}