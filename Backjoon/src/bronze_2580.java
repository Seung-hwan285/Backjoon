import java.util.Scanner;

public class bronze_2580 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int s=sc.nextInt();
		int cook_time=sc.nextInt();
		
		
		
		
		//90
		s+=cook_time%60;
		
		
		//73
		m+=cook_time/60;
		
		
		
		//m=74
		//s=30
		if(s>=60) {
			m=m+s/60;
			s=s%60;
		}
		//h=15
		//m=14
		if(m>=60) {
			h=h+m/60;
			
			m=m%60;
		}
		
		System.out.println(h+" "+m+" "+s);
		
		
	}

	

}
