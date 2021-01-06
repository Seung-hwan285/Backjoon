import java.util.Arrays;
import java.util.Scanner;

public class Friend_net {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		
		String []arr=new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		
		Arrays.sort(arr);
		
		
		int count=0;
		int max=0;
		
		String temp=arr[0];
		String res=" ";
		
		for(int i=0; i<arr.length; i++) {
		
			//두 책의 제목이 같은경우
			if(arr[i].equals(temp)) {
				count++;
			}
			
			
			//두 책의 제목이 다른경우
			else {
				
				//빈도가 높은책이 기준이 됨
				if(count>max) {
					max=count;
					res=temp;
					
				}
				
				
				//책 제목과 개수 초기화
				temp=arr[i];
				count=1;
			}
		}
		
		if(count >max) {
			res=temp;
		}
		
		System.out.println(res);
		
	}

}
