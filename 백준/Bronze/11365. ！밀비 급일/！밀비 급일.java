import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
        	String line = br.readLine();
        	if(line.equals("END"))break;
        	String [] arr = line.split("");
        	StringBuilder sb = new StringBuilder();
        	for(int i=arr.length-1;i>=0;i--) {
        		sb.append(arr[i]);
        	}
        	System.out.println(sb);
        }
    }
}