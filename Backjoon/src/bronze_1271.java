import java.math.BigInteger;
import java.util.Scanner;

public class bronze_1271 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	
		Scanner sc=new Scanner(System.in);
		//1000원이 들어옴
		BigInteger n=sc.nextBigInteger();
	
		
		
		//돈 받으러 온 사람들
		BigInteger m=sc.nextBigInteger();
		//생명체 하나에 들어가는 돈의 양 (나누기)
		
		System.out.println(n.divide(m));
		
		//1원씩 분배가능한 남는 돈 (나머지)
		System.out.println(n.mod(m));
		
	}

}
