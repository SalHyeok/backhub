import java.util.Scanner;





public class Main {
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	char[] arr= sc.next().toCharArray();
    	int [] nums = new int [26];
    	for(int i=0;i<arr.length;i++) {
    		nums[arr[i]-'a']++;
    	}
    	for(int i=0;i<26;i++) {
    		System.out.print(nums[i]+" ");    		
    	}
    	
    	
    }

}