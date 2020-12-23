import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class age_soritng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		String [][]arr=new String[n][2];
		
		for(int i=0; i<n; i++) {
			//문자열로 숫자를 입력을받음
			arr[i][0]=sc.next();
			arr[i][1]=sc.next();
		}
		
		
		
		Arrays.sort(arr,new Comparator<String[]>() {
			
			
			//양수면 체인지
			//음수거나 0이면 그대로냅둠
			public int compare(String n1[],String n2[]) {
				return Integer.parseInt(n1[0])-Integer.parseInt(n2[0]);
			}
			
		});
	
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}
}
