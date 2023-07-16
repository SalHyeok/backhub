import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	Scanner sc = new Scanner(System.in);
    	int [] spell=new int [26];
    	while(true) {
    		String row = br.readLine();
    		if(row==null)break;
    		char [] arr = row.toCharArray();
    		for(int i=0;i<arr.length;i++) {
    			if(arr[i]==' ')continue;
    			else {
    				spell[arr[i]-'a']++;
    			}
    		}    	
    	}
    	String [] arr= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    	String ans ="";
    	int max =0;
    	int maxi=0;
    	for(int i=0;i<26;i++) {
    		if(max<spell[i]) {
    			max=spell[i];
    			ans=arr[i];
    		}
    		else if(max==spell[i]) {
    			ans=ans+arr[i];
    		}
    	}
    	
    	
    	System.out.println(ans);
    	
    }
   

}