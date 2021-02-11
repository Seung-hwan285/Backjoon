import java.util.Scanner;

public class bronze_2475 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		

		
		long sum=0;
		long m = 0;
		
		for(int i=0; i<5; i++) {
			sum+=Math.pow(sc.nextInt(), 2);
		}
		
		System.out.println(sum%10);

		
	}

}
