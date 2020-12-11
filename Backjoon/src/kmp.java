import java.util.Scanner;

public class kmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		
		String s=sc.next();
		
		String answer="";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) >='A' && s.charAt(i)<='Z') {
				
				
				answer+=s.charAt(i);
			}
			
		}
		
		System.out.println(answer);
	}

}
