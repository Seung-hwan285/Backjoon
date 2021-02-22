import java.util.Scanner;

public class bronze_15964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//1.입력 2개 
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int n2=sc.nextInt();
		
		//2.가로 연산 2개
		
		
		int sum1=n+n2;
		int sum2=n-n2;
		
		//3.곱하기
		
		int res=0;
		
		res=sum1*sum2;
		System.out.println(res);
	}

}
