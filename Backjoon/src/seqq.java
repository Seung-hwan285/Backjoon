import java.util.Scanner;

public class seqq {
//	72,30
	    //1.최대공약수 
//	2자연수의 공통된 약수 중 가장 큰 수
//	6
	
	
	//2.최소공배수 
//	2자연수의 공통된 배수중에서 가장 작은 수를 
//	즉 최소공배수=2자연수 곱 /최대공약수
	
//	72 *30 /6=360
	
	
	//최대공약수
	
	static int gcd(int a,int b) {
		while(b!=0) {
			//나머지 
			int r=a%b;
			a=b;
			b=r;
		}
		
		return a;
	}

	    public static void main(String[] args) {
	     
	   
	    	
	    	Scanner sc=new Scanner(System.in);
	    	
	    	int a=sc.nextInt();
	    	int b=sc.nextInt();
	    	
	    	//최대공약수 6
	    	int gcd=gcd(a,b);
	    	//최소공배수
	    	int lcm=(a*b/gcd);
	    	
	    	System.out.println(gcd);
	    	System.out.println(lcm);
	    	
	        
	   }	
}


