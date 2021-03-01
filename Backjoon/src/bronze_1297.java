import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class bronze_1297 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		
		
		//1.피타고라스 정의 
		
		//c^2=a^2+b^2 (c는 빗변 ==대각선 )
		
		//x=대각선 길이 ^2=(너비^2)+(높이^2)
	
		//x를 구햇으니 높이와 너비에 x를 곱해준다
		
		
		//반올림을 해야해서 Maht.floor반올림을 해줍니다 소수점 아래 숫자들은 전부 제거 
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		String []temp=br.readLine().split(" ");
		
		int c=Integer.parseInt(temp[0]);
		
		int a=Integer.parseInt(temp[1]);
		
		int b=Integer.parseInt(temp[2]);
		
		
		double x=Math.sqrt(Math.pow(c, 2)/(Math.pow(a, 2)+Math.pow(b,2)));
		
		
		System.out.println((int)Math.floor(x*a));
		System.out.println((int)Math.floor(x*b));
		
		
	}

}
