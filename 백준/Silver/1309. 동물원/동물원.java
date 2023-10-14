import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1,1,1,-1,-1};
    static int[] dc = {0, -1, 1, 0,1,-1,1,-1};
    


    
    
    static char [][]arr;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = sc.nextInt();
        int [][] arr = new int [100001][3];
        arr[1][0]=1;
        arr[1][1]=1;
        arr[1][2]=1;
        for(int i=2;i<=n;i++) {
        	arr[i][0]+=(arr[i-1][0]+arr[i-1][1]+arr[i-1][2])%9901;//사자0
        	arr[i][1]+=(arr[i-1][0]+arr[i-1][2])%9901;//왼사자
        	arr[i][2]+=(arr[i-1][0]+arr[i-1][1])%9901;//오른사자
        }
        System.out.println((arr[n][0]+arr[n][1]+arr[n][2])%9901);
        
        
        
    }
	
    


	
}