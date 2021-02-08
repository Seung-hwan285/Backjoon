import java.util.Scanner;

public class sum_1_2 {

	   public static void main(String[] args) {

		   
		   
		   long answer;
		   
		   long arr[][]=new long[100001][4];
		   
		   arr[1][1]=arr[2][2]=arr[3][3]=1;
		   
		   
		   for(int i=1; i<arr.length; i++) {
			   
			   
			   if(i>1) 
				   arr[i][1]=(arr[i-1][2]+arr[i-1][3])% 1000000009;
			   
			   
			   if(i>2) 
				   arr[i][2]=(arr[i-2][1]+arr[i-2][3])% 1000000009;
			   
			   
			   if(i>3)
				   arr[i][3]=(arr[i-3][1]+arr[i-3][2])% 1000000009;
			   
		   }
			   Scanner sc=new Scanner(System.in);
			   
			   int n=sc.nextInt();
			   
			   while(n-->0) {
				   int num=sc.nextInt();
				   
				   answer=(arr[num][1]+arr[num][2]+arr[num][3])% 1000000009;
			   
				   System.out.println(answer);
			   }
		   
		   
		   
	   }
}