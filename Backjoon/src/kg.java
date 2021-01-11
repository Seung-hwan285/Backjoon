import java.util.Scanner;

public class kg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		
		
		for(int i=0; i<n; i++) {
			//몸무게
			arr[i][0]=sc.nextInt();
			//키
			arr[i][1]=sc.nextInt();
			
			
		}
		
		for(int i=0; i<n; i++) {
		
			//등슈 1등으로 초기화
			int rank=1;
			
			for(int j=0; j<n; j++) {
				if(i==j)
				{
					continue;
				}
				
				//1.몸무게 먼저 비교
				//2.키 비교
				if(arr[i][0]<arr[j][0] && arr[i][1] <arr[j][1]) {
					rank++;
				}
			}
			
			System.out.print(rank+" ");
		}
		

	}

}
