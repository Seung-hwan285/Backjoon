import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class x_y_sorting2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		
		
		for(int i=0; i<n; i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		
		
		Arrays.sort(arr, new Comparator<int[]>() {
			
			
			public int compare(int n1[],int n2[]) {
				if(n1[0]==n2[0]) {
					return Integer.compare(n1[1], n2[1]);
				}
				
				return Integer.compare(n1[0], n2[0]);
			}
			
		});
		
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
	}

}
