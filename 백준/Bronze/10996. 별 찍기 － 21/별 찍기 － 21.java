import java.util.Scanner;





public class Main {
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	for(int t=0;t<n;t++) {
    		if(n%2!=0) {
    			for(int i=1;i<=n;i++) {
    				if(i%2!=0) {
    					System.out.print("*");
    				}
    				else {
    					System.out.print(" ");
    				}
    			}
    			System.out.println();
    			for(int i=1;i<=n-1;i++) {
    				if(i%2!=0) {
    					System.out.print(" ");
    				}
    				else {
    					System.out.print("*");
    				}
    			}
    			System.out.println();
    		}
    		else {
    			for(int i=1;i<=n-1;i++) {
    				if(i%2!=0) {
    					System.out.print("*");
    				}
    				else {
    					System.out.print(" ");
    				}
    			}
    			System.out.println();
    			for(int i=1;i<=n;i++) {
    				if(i%2!=0) {
    					System.out.print(" ");
    				}
    				else {
    					System.out.print("*");
    				}
    			}
    			System.out.println();
    			
    		}
    	}
    	
    }

}