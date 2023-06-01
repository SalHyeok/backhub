import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Scanner;
import java.util.Scanner;

public class Main {
		static int [] sel;
		static boolean [] cycle;
		static boolean [] ans;
		public static void main(String[] args) {
//			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			double [] x = new double [n+1];
			double [] y = new double [n+1];
			for(int t=0;t<n;t++) {
				x[t] = sc.nextDouble();
				y[t] = sc.nextDouble();		
			}
			x[n]=x[0];
			y[n]=y[0];			
			double sum = 0;
			for(int t=0;t<n;t++) {
				sum +=((x[t]*y[t+1])-(x[t+1]*y[t]));						
			}			
			sum = Math.abs(sum)/2;
			System.out.println(String.format("%.1f", sum));;				
		}
		
		

}
