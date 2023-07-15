import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static class gitar implements Comparable<gitar>{
		String s;

		public gitar(String s) {			
			this.s = s;
		}

		@Override
		public int compareTo(gitar o) {
			// TODO Auto-generated method stub
			if(this.s.length()<o.s.length()) {
				return -1;
			}
			else if(this.s.length()>o.s.length()) {
				return 1;
			}
			else {
				int osum=0;
				int thissum=0;
				char [] oarr=o.s.toCharArray();
				char [] thisarr=this.s.toCharArray();
				for(int i=0;i<o.s.length();i++) {
					if(oarr[i]<='9'&&oarr[i]>'0') {
						osum+=oarr[i]-'0';
					}
					if(thisarr[i]<='9'&&thisarr[i]>'0') {
						thissum+=thisarr[i]-'0';
					}
				}
				if(thissum<osum) {
					return -1;
				}
				else if(thissum>osum) {
					return 1;
				}
				else {
					return this.s.compareTo(o.s);
				}
			}
		}
	}
	
    public static void main(String[] args) throws NumberFormatException, IOException {    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    	Scanner sc = new Scanner(System.in);
    	int n = Integer.parseInt(br.readLine());
    	PriorityQueue<gitar> pq = new PriorityQueue<>();
    	for(int i=0;i<n;i++) {
    		pq.add(new gitar(br.readLine()));
    	}
    	while(!pq.isEmpty()) {
    		System.out.println(pq.poll().s);
    	}
    	
    	
    }
   

}