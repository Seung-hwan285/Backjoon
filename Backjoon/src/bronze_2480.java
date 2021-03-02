import java.util.Scanner;

public class bronze_2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.같은 값이 3개면 10000+a*1000
		
		//2.같은 값이 2개면 1000+a*100
		
		//3.모두 다른 눈이 나오는 경우 (가장 큰수 )*100
		
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int sum=0;
		
		if(a==b && a==c &&b==c) {
			System.out.println(10000+(a*1000));
		}
		
		else if(a==b ||a==c) {
			System.out.println(1000+(a*100));
		}
		
		else if(b==c) {
			System.out.println(1000+(a*100));
		}
		else {
			int z=Math.max(a, b);
			
			z=Math.max(z, c);
			sum=z*100;
			System.out.println(sum);
		}
		
	}

}
