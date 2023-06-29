


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {    	
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextInt();
    	long [] dice = new long [6];
    	long min1 = 50;
    	long min2 = Long.MAX_VALUE;
    	long min3 = Long.MAX_VALUE;
    	long sum =0;
    	long max =0;
    	for(int i=0;i<6;i++) {
    		dice[i]=sc.nextInt();
    		if(dice[i]<min1) {
    			min1=dice[i];    			
    		}
    		sum+=dice[i];
    		max = Math.max(max, dice[i]);
    	}
    	long ans =((n-2)*(n-1)*4+(n-2)*(n-2))*min1;
    	int [][] diceline= {{0,1},{0,2},{0,3},{0,4},{1,2},{2,4},{4,3},{3,1},{5,1},{5,2},{5,3},{5,4}};
    	int [][] dicepoint = {{0,1,2},{0,2,4},{0,4,3},{0,3,1},{5,1,2},{5,2,4},{5,3,4},{5,3,1}};
    	for(int i=0;i<12;i++) {
    		long x =dice[diceline[i][0]]+dice[diceline[i][1]];
    		min2 = Math.min(x, min2);
    	}
    	for(int i=0;i<8;i++) {
    		long x =dice[dicepoint[i][0]]+dice[dicepoint[i][1]]+dice[dicepoint[i][2]];
    		min3 = Math.min(x, min3);
    	}
    	ans=ans+(8*n-12)*min2+4*min3;
    	if(n==1) {
    		System.out.println(sum-max);
    	}
    	else {
    		System.out.println(ans);
    	}
    	
    	
    }
   

}