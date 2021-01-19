import java.util.Scanner;


//1.에라토스테네스 체 알고리즘 

public class gold {

	
	
	
	
	
	public static final int MAX=10;
	
	//8 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		
		Scanner sc=new Scanner(System.in);
		
		
		boolean []isprem=new boolean[MAX+1];
		
		
		for(int i=2; i<=MAX; i++) {
			isprem[i]=true;
		}
		
		for(int i=2; i<=MAX; i++) {
			
			//2 
			//4
			//8
			//10 
			for(int j=i*2; j<=MAX; j+=i) {
				//fasle라면
				if(!isprem[j]) {
					continue;
				}
				
				//true라면
				isprem[j]=false;
			}
		}
		
		
		
		
		while(true) {
			int n=sc.nextInt();
			
			boolean ok=false;
			
			
			if(n==0) {
				break;
			}
			
			
			
			for(int i=2; i<=n/2; i++) {
				if(isprem[i] && isprem[n-i]) {
					System.out.println(n+" = "+i+" + "+(n-i));
					ok=true;
					break;
				}
			}
			
			if(!ok) {
				System.out.println("Goldbach's conjecture is wrong");
			}
		}
		
	}
	
}