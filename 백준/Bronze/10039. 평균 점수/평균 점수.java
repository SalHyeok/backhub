
import java.util.Scanner;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =0;
		for(int i=0;i<5;i++) {
			int a = sc.nextInt();
			if(a<40) {
				n+=40;
			}
			else {
				n+=a;
			}
		}
		System.out.println(n/5);
		
	}

}
