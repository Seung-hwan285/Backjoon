import java.util.Scanner;

public class bronze_20492 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.상금을 탐 1000 22%
		//220 
		//1000-220
		
		
		//2.800
		//1000-800=200
		//200 22% =>44
		//200 *22=4400 /100=44
		//200 -44=156
		
		//800+156=956
		
		
		Scanner sc=new Scanner(System.in);
		
		int money=sc.nextInt();
//		1번
		//220
		int res=(money*22)/100;
		
		//780
		int res2=money-res;
		System.out.print(res2+" ");
//		2번
		//800
		int res3=(money*80)/100;
		
		//200
		int res4=money-res3;
		
		//200 22% =>44
		int res5=(res4*22)/100;
		
		///200-44 =>156
		int res6=res4-res5;
		
		int res7=res3+res6;
		System.out.print(res7);
		
		
	}

}
