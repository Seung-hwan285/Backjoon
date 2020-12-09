import java.util.Scanner;

public class eng_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner  sc=new Scanner(System.in);
		
		
		String s=sc.next();
		
		for(char i='a'; i<='z'; i++) {
			System.out.println(s.indexOf(i)+" ");
		}
	
	}

}
