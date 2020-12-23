import java.util.Arrays;
import java.util.Scanner;

public class gold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		

		
		int []a=new int[n];
		int []b=new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		int sum=0;
		//0,1,2
		for(int i=0; i<n; i++) {
			
			//a[i]=6
			//b[i]=1
			
			//a[i]=1
			//b[i]=2
			
			
			//a[i]=1
			//b[i]=3
			sum+=a[i]*b[n-1-i];
		}
		
		
		System.out.println(sum);
		
	
	}

}
