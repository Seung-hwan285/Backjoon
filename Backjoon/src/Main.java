import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) throws Exception {
      
            


		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		String str=br.readLine();
		
		char ch[]=str.toCharArray();
		
		
		for(int i=0; i<str.length(); i++) {
			if(95<=ch[i] && ch[i]<=122) {
				ch[i]=(char)(ch[i]-32);
				continue;
			}
			
			if(65 <=ch[i] && ch[i] <=90) {
				ch[i]=(char)(ch[i]+32);
				continue;
			}
		}
		
		System.out.println(ch);
			
		

		
		
	}

}