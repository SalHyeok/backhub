import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long [][] arr =new long [33334][3];
        //10,11,12,20,21,22
        arr[1][0]=0;
        arr[1][1]=1;
        arr[1][2]=1;
        
        
        for(int i=2;i<33334;i++) {
        	arr[i][0]=(arr[i-1][1]+arr[i-1][2]+arr[i-1][0])%1000000009;
        	arr[i][1]=(arr[i-1][0]+arr[i-1][2]+arr[i-1][1])%1000000009;
        	arr[i][2]=(arr[i-1][0]+arr[i-1][1]+arr[i-1][2])%1000000009;
        }       
        int n = sc.nextInt();
        System.out.println(arr[n][0]);
    }
}