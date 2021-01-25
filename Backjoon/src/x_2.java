import java.util.Scanner;

public class x_2 {


		 public static void main(String[] args) {
		      

			 
			 
			 
			 Scanner sc=new Scanner(System.in);
			 
			 int n=sc.nextInt();
			 
			 
			 int dp[]=new int[1001];
			 dp[1]=1;
			 dp[2]=2;
			 
			 //i=3-1=2 -->2
			 //i=3-2=1 -->1
			 //3 --->3
			 
			 //i=4-1=3 --->3
			 //i=4-2=2 --->2
			 //4 --->5
			 for(int i=3; i<=n; i++ ) {
				 dp[i]=(dp[i-1]+dp[i-2])%10007;
				 
			 }
			 
			 System.out.println(dp[n]);
			 
			 
			 
		    }
		}