import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bronze_14928 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String input=br.readLine();
		
		
		int now=0;
		
		int mod=20000303;
		
		for(int i=0; i<input.length(); i++) {
			int v=input.charAt(i)-'0';
			now*=10;
			now=now+v;
			now%=mod;
		}
		
		System.out.println(now);
		
		
	}

}
