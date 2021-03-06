import java.util.Scanner;

public class bronze_2525 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		int h=sc.nextInt();
		int m=sc.nextInt();
		int cook_time=sc.nextInt();
		
		
		m=m+cook_time;
		
		while(m>=60) {
			m-=60;
			h+=1;
			
			
			if(h>=24) {
				h=0;
			}
		}
		System.out.println(h+" "+m);
	}

}
