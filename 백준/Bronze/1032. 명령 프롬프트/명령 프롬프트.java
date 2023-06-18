import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	char [] a =sc.next().toCharArray(); 
    	for(int i=1;i<n;i++) {
    		char [] b = sc.next().toCharArray();
    		for(int j=0;j<a.length;j++) {
    			if(a[j]==b[j])continue;
    			else {
    				a[j]='?';
    			}
    		}
    	}
    	for(int i=0;i<a.length;i++) {
    		System.out.print(a[i]);
    	}
    	
    	
    }
   

}