import java.util.Scanner;

public class bronze_2845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		int person=sc.nextInt();
		int a=sc.nextInt();
		
		// 1.참가자 수 넣어줄 배열
		int arr1[]=new int[5];
		
		// 2.상근이가 계산한 참가 수 -기사에 적혀있는 참가자 수 (차이)
		int arr2[]=new int[5];
		
		
		for(int i=0; i<5; i++) {
			arr1[i]=sc.nextInt();
			
			
			arr2[i]=arr1[i]-(person *a);
			
			System.out.print(arr2[i]+" ");
		}
		
		
	}

}
