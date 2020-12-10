import java.util.Scanner;

public class alpa_find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		int arr[]=new int[26];
		
		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)-97]++;
		}
		
		
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
