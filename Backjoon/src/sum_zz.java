import java.util.Scanner;

public class sum_zz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int res=0;
		
		for(int i=0; i<n; i++) {
			int number=i;
			
			
			
			int sum=0;
			
			while(number !=0) {
				sum+=number%10;
				number/=10;
			}
			
			
			if(sum+i==n) {
				res=i;
				break;
			}
		}
		
		System.out.println(res);
		

	
	}

}
