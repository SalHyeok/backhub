import java.util.Scanner;

public class Main {
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = 2*n-1;
    	for(int i=0;i<n;i++) {
    		for(int j=0;j<i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=0;j<m-2*i;j++) {
    			System.out.print("*");    			
    		}
    		System.out.println();
    	}
    	for(int i=n-2;i>=0;i--) {
    		for(int j=0;j<i;j++) {
    			System.out.print(" ");
    		}
    		for(int j=0;j<m-2*i;j++) {
    			System.out.print("*");    			
    		}
    		System.out.println();
    	}
    	
    }

}