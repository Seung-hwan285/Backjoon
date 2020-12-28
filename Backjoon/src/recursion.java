import java.util.Scanner;

public class recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int sum=Faction(n);
		
		
		System.out.println(sum);
		

		
	}
	
	public static int Faction(int n) {
		
		
		//함수종료
		if(n==1) {
			return 1;
		}
		
		//5*4=20
		//20*3=60
		//60*2=120
		//120*1=120
		else {
			return n+Faction(n-1);
		}
	}

}
