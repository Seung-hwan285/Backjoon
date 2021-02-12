import java.util.Scanner;

public class bronze_5554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		int n4=sc.nextInt();
		
		
		int sum=0;
		sum=n1+n2+n3+n4;
		
		int res1=sum/60;
		int res2=sum%60;
		
		System.out.println(res1);
		System.out.println(res2);
		
		
		
	}

}
