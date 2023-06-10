import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==1) {
			System.out.println(666);
		}
		else {
			int cnt =1;
			for(int i=1666;;i++) {
				int check =i;
				for(int j=0;check!=0;j++) {
					if(check%1000==666) {
						cnt++;
						break;
					}				
					check = check/10;
				}
				if(cnt==n) {
					System.out.println(i);
					break;
				}
			}
			
		}
	}

}
