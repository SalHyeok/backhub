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
    	char [][] arr = new char[8][8];
    	for(int i=0;i<8;i++) {
    		arr[i]=br.readLine().toCharArray();
    	}
    	int ans =0;
    	for(int i=0;i<8;i++) {
    		for(int j=0;j<8;j++) {
    			if((i+j)%2==0&&arr[i][j]=='F') {
    				ans++;
    			}
    		}
    	}
    	System.out.println(ans);
    	
    	
    }
   

}