import java.util.Scanner;
import java.util.Stack;

public class stick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int res=0;
		
		Stack<Integer>stack=new Stack<Integer>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i)=='(') {
				stack.push(i);
			}
			else {
				//서로 인접하다면 
				if(stack.pop()==i-1) {
					res+=stack.size();
				}
				
				else {
					res+=1;
				}
			}
			System.out.println(res);
			
		}
		
	}

}
