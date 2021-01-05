import java.util.HashMap;
import java.util.Scanner;

public class fa_sin {


	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		
		//테스트 케이스
		int t=sc.nextInt();
		
		
		while(t-->0) {
			HashMap<String,Integer>hm=new HashMap();
			
			
			
			
			//입력받은 총옷의 개수
			int n=sc.nextInt();
			
			
			while(n-->0) {
				
			//옷 이름은 필요없음 
			sc.next();
			
			
			//옷의 종류
			String kind=sc.next();
			
			
			if(hm.containsKey(kind)) {
				hm.put(kind, hm.get(kind)+1);
			}
			
			else {
				hm.put(kind, 1);
			
			
			}
		}
		
		int res=1;
		
		//안입는 경우 각 종류별 옷의 개수에 +1해준값을 곱한다
		for(int val:hm.values()) {
			res*=(val+1);
		}
		
		//알몸인상태를 제외해주어야하므로 -1
		System.out.println(res-1);
		}
	}
}