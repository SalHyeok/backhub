import java.util.Scanner;

public class Main {	
    public static void main(String[] args) {    	
    	Scanner sc = new Scanner(System.in);
    	char [] st = sc.next().toCharArray();
    	int ans =0;
    	for(int i=0;i<st.length;i++) {
    		if(i<st.length-1&&st[i]=='c'&&st[i+1]=='=') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-1&&st[i]=='c'&&st[i+1]=='-') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-1&&st[i]=='d'&&st[i+1]=='-') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-1&&st[i]=='l'&&st[i+1]=='j') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-1&&st[i]=='n'&&st[i+1]=='j') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-1&&st[i]=='s'&&st[i+1]=='=') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-1&&st[i]=='z'&&st[i+1]=='=') {
    			ans++;
    			i++;
    		}
    		else if(i<st.length-2&&st[i]=='d'&&st[i+1]=='z'&&st[i+2]=='=') {
    			ans++;
    			i++;
    			i++;
    		}
    		else {
    			ans++;
    		}
    	}
    	System.out.println(ans);
    	
    	
    	
    	
    }
   

}