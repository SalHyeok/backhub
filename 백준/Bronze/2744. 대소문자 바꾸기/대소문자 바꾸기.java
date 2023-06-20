import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	char[] arr = sc.next().toCharArray();
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]>='a'&&arr[i]<='z') {
    			System.out.print(Character.toUpperCase(arr[i]));
    		}
    		else {
    			System.out.print(Character.toLowerCase(arr[i]));
    		}
    	}    	
    	
    	
    }
   

}