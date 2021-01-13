import java.util.Scanner;

public class sum_1_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		
		int t=sc.nextInt();
		
		
		int arr[]=new int[11];
		
		arr[1]=1;//1을넣을경우= 1가지
		arr[2]=2;//2 ~ 1+1,2= 2가지
		arr[3]=4;//3~ 1+1+1,2+1,1+2,3= 4가지
		
		//0,1,2,3,4~n
		
		for(int i=0; i<t; i++) {
			int n=sc.nextInt();
			
			for(int j=4; j<=n; j++) {
				arr[j]=arr[j-1]+arr[j-2]+arr[j-3];
			}
			
			System.out.println(arr[n]);
		}
		
		
		
	}

}
