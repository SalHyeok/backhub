import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static boolean [] vis =new boolean [9];
	static int [] match = new int [9];
	static int n;
	static int [][] arr;
	static int max;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr= new int [n][9];
		for(int i=0;i<n;i++) {
			String [] line = br.readLine().split(" ");			
			for(int j=0;j<9;j++) {
				arr[i][j]=Integer.parseInt(line[j]);
			}
		}
		vis [0]= true; 
		max = 0;
		playball(0);		
		System.out.println(max);
	}
	private static void playball(int k) {
		if(k==3) {
			match[3]=0;
			playball(4);			
		}
		else if(k==9) {
			maxscore();
			return;
		}
		else {
			for(int i=0;i<9;i++) {
				if(!vis[i]) {
					vis[i]=true;
					match[k]=i;
					playball(k+1);
					vis[i]=false;
				}
			}			
		}		
		
	}
	private static void maxscore() {
		int score =0;
		int num =0;
		for(int i=0;i<n;i++) {
			int outcnt =0;
			boolean [] plate =new boolean [3];			
			for(;outcnt<3;num++) {
				switch(arr[i][match[num%9]]) {				
					case 1:
						if(plate[2]) {
							plate[2]=false;
							score++;
						}
						for(int j=1;j>=0;j--) {
							if(plate[j]) {
								plate[j]=false;
								plate[j+1] = true;
							}
						}
						plate[0]=true;
						break;
					case 2:						
						for(int j=2;j>=1;j--) {
							if(plate[j]) {
								plate[j]=false;
								score++;
							}
						}
						if(plate[0]) {
							plate[0]=false;
							plate[2]=true;
						}
						plate[1]=true;
						break;
					case 3:
						for(int j=0;j<3;j++) {
							if(plate[j]) {
								score++;
								plate[j]=false;
							}
						};
						plate[2]=true;
						break;
					case 4:
						score++;
						for(int j=0;j<3;j++) {
							if(plate[j]) {
								score++;
								plate[j]=false;
							}
						};
						break;
					case 0: 
						outcnt++;						
						break;
				}
			}
			
		}
		if(max<score) {
			max=score;
		}		
		
	}

}