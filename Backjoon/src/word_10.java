import java.util.Scanner;

public class word_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		
		
		
		String s=sc.nextLine();
		
		
		for(int i=0; i<s.length(); i++) {
			if(i%9==0 && i!=0) {
				System.out.println();
			}
			
			System.out.print(s.charAt(i));
		}
		
	}

}
