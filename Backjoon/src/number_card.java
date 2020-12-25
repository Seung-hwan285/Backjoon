import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class number_card {

	public static void main(String[] args) throws  IOException{
	
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int n=Integer.parseInt(br.readLine());
		
		PriorityQueue<Long>pq=new PriorityQueue<>();
		
		
		for(int i=0; i<n; i++) {
			pq.add(Long.parseLong(br.readLine()));
			
		}
		
		int sum=0;
		
		if(pq.size()==1) {
			System.out.println(0);
			return;
		}
		
		
		while(!pq.isEmpty()) {
			long a=pq.poll();
			
			long b=pq.poll();
			
			
			sum+=a;
			sum+=b;
			
			if(!pq.isEmpty()) {
				pq.add(a+b);
			}
		}
		System.out.println(sum);
		
	
	}

}
