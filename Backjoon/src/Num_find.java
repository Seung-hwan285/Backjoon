import java.util.Scanner;

public class Num_find {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		
		Scanner sc=new Scanner(System.in);
		
		int num=sc.nextInt();
		
		int cnt1=0;
		int cnt2=0;
		
		for(int i=0; i<num; i++) {
			int num2=sc.nextInt();
			cnt1=0;
			
			for(int j=1; j<=num2; j++) {
				
				
				if(num2%j==0) {
					cnt1++;
				}
			}
			
			if(cnt1==2) {
				cnt2++;
			}
		}
		
		System.out.println(cnt2);
	
		
		
		
		
	}
 
}