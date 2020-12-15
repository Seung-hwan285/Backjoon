import java.util.Scanner;
import java.util.Stack;

public class HackerRank_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		Stack<Integer>mainStack=new Stack<Integer>();
		Stack<Integer>maxStack=new Stack<Integer>();
		
		
		maxStack.push(Integer.MIN_VALUE);
		
		
		for(int i=0; i<n; i++) {
			int num=sc.nextInt();
			
			switch(num) {
			case 1:
				int x=sc.nextInt();
				mainStack.push(x);
				int maxNumber=maxStack.peek();
				
				
				if(x>maxNumber) {
					maxStack.push(x);
				}
				
				else {
					maxStack.push(maxNumber);	
				}
				break;
				
				
			case 2:
				mainStack.pop();
				maxStack.pop();
				break;
				
			case 3:
				System.out.println(maxStack.peek());
				break;
			}
		}
		
	}

}
