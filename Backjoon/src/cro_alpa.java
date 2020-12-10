import java.util.Scanner;

public class cro_alpa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		
		String arr[]= {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		String s=sc.next();
		
		for(int i=0; i<s.length(); i++) {
			if(s.contains(arr[i])) {
				s=s.replaceAll(arr[i]," ");
				
			}
		}
		System.out.println(s.length());

	}

}
