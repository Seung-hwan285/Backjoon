import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		Scanner sc=new Scanner(System.in);
		
		char c[][]=new char[5][15];
		
		for(int i=0; i<c.length; i++) {
			String s=sc.next();
			
			for(int j=0; j<s.length(); j++) {
				c[i][j]=s.charAt(j);
			}
		}
		
		
		for(int i=0; i<15; i++) {
			for(int j=0; j<5; j++) {
				if(c[j][i]==' '|| c[j][i]=='\0') {
					continue;
				}
				
				System.out.print(c[j][i]);
			}
		}
		
	}

}
