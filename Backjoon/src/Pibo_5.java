import java.util.Scanner;

public class Pibo_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(fibo(n));
		
		
	}
	
	public static int fibo(int n) {
		if(n==0)
			return 0;
		
		if(n==1)
			return 1;
		
		
		//(4)=(3)+(2)
		//(3)=(2)+(1)
		//(2)=(1)+(0)
		
		
		//(2)=1+0=1
		//(3)=1+1=2
		//(4)=2+1=3
		else {
			return fibo(n-1)+fibo(n-2);
		}
	}
}
