import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fa_sin {


	public static void main(String[] args) {
	
		
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		String str1,str2;
		
		
		Set<String> set=new HashSet();
		
		
		
		
		
		for(int i=0; i<n; i++) 
		{
			
			str1=sc.next();
			str2=sc.next();
			
			if(str2.equals("enter")) {
				set.add(str1);
			}
			else
			{
				set.remove(str1);
			}
		}
		
		
		//set->arr
		String []arr=new String[set.size()];
		
		
		set.toArray(arr);
		//오름
		Arrays.sort(arr);
		
		
		//내림차순 출력
		
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		

	}
}