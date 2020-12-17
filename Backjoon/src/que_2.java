import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class que_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		Queue<Integer> q=new LinkedList<Integer>();
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		StringBuilder   str=new StringBuilder();
		
		
		
		for(int i=1; i<=n; i++) {
			q.offer(i);
		}
		str.append("<");
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<m-1; j++) {
				q.offer(q.poll());
			}
			
			str.append(q.poll()+", ");
		}
		
		str.append(q.poll()+">");
		System.out.println(str);
	}

}
