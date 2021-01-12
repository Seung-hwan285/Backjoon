import java.util.Arrays;
import java.util.Scanner;

public class person_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int n=9;
		
		int sum=0;
		int arr[]=new int[9];
		
		//1.배열에 데이터 입력받고 sum에 중첩해서 삽입 
		//140
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(sum-arr[i]-arr[j]==100) {
					for(int k=0; k<n; k++) {
						if(i==k || j==k) {
							continue;
						}
						System.out.println(arr[k]);
					}
					
					System.exit(0);
				}
			}
		}
	}

}
