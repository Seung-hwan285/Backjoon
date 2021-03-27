import java.util.Scanner;
import java.util.Stack;

public class bronze_5532 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
	

		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
	
		
		Stack<Integer>s=new Stack();
		
		for(int i=0; i<n; i++) {
			int n2=sc.nextInt();
			
			
			if(n2==0) {
				s.pop();
			}
			else {
				s.push(n2);
			}
		}
		int sum=0;
		for(Integer i:s) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		
		
		
		
	}

}
