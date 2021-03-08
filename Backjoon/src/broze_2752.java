import java.util.Arrays;
import java.util.Scanner;

public class broze_2752 {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		
		int []intArr=new int[3];
		
		intArr[0]=sc.nextInt();
		intArr[1]=sc.nextInt();
		intArr[2]=sc.nextInt();
		
		
		
		for(int i=0; i<intArr.length; i++) {
			Arrays.sort(intArr);
		}
		
		for(int i:intArr) {
			System.out.print(i+" ");
		}
		
		
		
		
	
		
		
		
	}
}
