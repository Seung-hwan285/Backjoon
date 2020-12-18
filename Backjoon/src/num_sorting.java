import java.util.Scanner;

public class num_sorting {

	public static void main(String[] args) {
		
		
		
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	
	
	int temp;
	
	for(int i=0; i<a.length; i++) {
		
		a[i]=sc.nextInt();
	}
	
	for(int i=0; i<n; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
				
				
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	
	for(Integer i:a) {
		System.out.println(i);
	}
	}
}