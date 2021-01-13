import java.util.Arrays;
import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		Scanner sc=new Scanner(System.in);
		
		int e=1,s=1,m=1;
		
		
		int E=sc.nextInt();
		int S=sc.nextInt();
		int M=sc.nextInt();
		
		
		int year=1;
		while(true) {
			
			
			if(e==E && s==S && m==M) {
				
				break;
			}
			
			
			e+=1;
			s+=1;
			m+=1;
			
			if(e==16) {
				e=1;
			}
			if(s==29) {
				s=1;
			}
			if(m==20) {
				m=1;
				
			}
			year++;
		}
		System.out.println(year);
	}

}
