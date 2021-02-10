import java.util.Scanner;

public class harddddd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		int a[] = new int[n];
		int dp[] = new int[n];
		
		// 데이터 입력
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		// 누적합을 저장하는 dp 배열에 0번 인덱스 값을 초기화
		dp[0] = a[0];
				
		// 1번 인덱스부터 시작
		for(int i=1;i<n;i++) {
			// 누적합으로 오는 경우는 1. 자신부터 선택 시작 2. 자신 이전부터 선택 시작 3. 자신 이전까지 누적되어온 값에 이어 선택
			// 이 중 최댓값을 저장하면 된다. 
			dp[i] = Math.max(Math.max(a[i], dp[i-1]+a[i]),a[i] + a[i-1]);
		}
		
		// 최댓값을 찾아 출력
		int max = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			if(dp[i]>max)
				max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
		
		in.close();
	}

}