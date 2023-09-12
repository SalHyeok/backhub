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
        	String x = br.readLine();
        	if(x.equals("# 0 0"))break;
        	String [] arr = x.split(" ");
        	int age = Integer.parseInt(arr[1]);
        	int weight = Integer.parseInt(arr[2]);
        	if(age>17||weight>=80) {
        		System.out.println(arr[0]+" Senior");
        	}
        	else {
        		System.out.println(arr[0]+" Junior");
        	}
        }
    }
}