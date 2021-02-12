import java.util.Scanner;

public class bronze_3003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//1.배열 
		int arr[]= {1,1,2,2,2,8};
		
		int res=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr[i]-sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		
	
		
		
	}

}
