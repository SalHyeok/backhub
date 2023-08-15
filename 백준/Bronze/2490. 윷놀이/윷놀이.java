import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int[] dr = {-1, 0, 0, 1};
    static int[] dc = {0, -1, 1, 0};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int j=0;j<3;j++) {
        	int cnt =0;
        	for(int i=0;i<4;i++) {
        		if(sc.nextInt()==0) {
        			cnt++;
        		}
        	}
        	switch (cnt) {
        	case 0:
        		System.out.println("E");
        		break;
        	case 1:
        		System.out.println("A");
        		break;
        	case 2:
        		System.out.println("B");
        		break;
        	case 3:
        		System.out.println("C");
        		break;
        	case 4:
        		System.out.println("D");
        		break;        	
        	}        	
        }
        
    }
}