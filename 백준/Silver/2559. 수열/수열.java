import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String [] nm = bf.readLine().split(" ");
		int n = Integer.parseInt(nm[0]);
		int m = Integer.parseInt(nm[1]);
		String [] str = bf.readLine().split(" ");
		int [] num = new int [n];
		num[0]= Integer.parseInt(str[0]);		
		for(int i=1;i<n;i++) {
			num[i] = Integer.parseInt(str[i])+num[i-1];
		}
		int max =num[m-1];
		for(int i=m;i<n;i++) {
			if(max<num[i]-num[i-m]) {
				max=num[i]-num[i-m];
			}
			
			
			
			
		}
		bw.write(Integer.toString(max));
		bw.flush();
		bw.close();

	}

}