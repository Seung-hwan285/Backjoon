import java.util.Scanner;

public class phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		
		
		char c[]=s.toCharArray();
		int sum=0;
		
		
		for(int i=0; i<s.length(); i++) {
			char ch=c[i];
			
			
			if(ch >='A' && ch<='C') {
				sum+=3;
			} else if (ch >= 'D' && ch <= 'F'){
                sum +=4;
		// 알파벳이 GHI 중 하나라면 + 5초
            } else if (ch >= 'G' && ch <= 'I'){
                sum +=5;
		// 알파벳이 JKL 중 하나라면 + 6초
			}else if (ch >= 'J' && ch <= 'L'){
                sum +=6;
		// 알파벳이 MNO 중 하나라면 + 7초
            }else if (ch >= 'M' && ch <= 'O'){
                sum +=7;
		// 알파벳이 PQRS 중 하나라면 + 8초
            }else if (ch >= 'P' && ch <= 'S'){
                sum +=8;
		// 알파벳이 TUV 중 하나라면 + 9초
            }else if (ch >= 'T' && ch <= 'V'){
                sum +=9;
		// 알파벳이 WXYZ 중 하나라면 + 10초
            }else if (ch >= 'W' && ch <= 'Z'){
                sum +=10;
            }
        }
        System.out.println(sum);
    }		
	
}
		

