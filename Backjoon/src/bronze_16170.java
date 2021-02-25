import java.text.SimpleDateFormat;
import java.util.Date;

public class bronze_16170 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String p="yyyy";
		String p1="MM";
		String p2="dd";
		
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat(p);
		SimpleDateFormat simpleDateFormat1=new SimpleDateFormat(p1);
		SimpleDateFormat simpleDateFormat2=new SimpleDateFormat(p2);
		
		String data=simpleDateFormat.format(new Date());
		String data1=simpleDateFormat1.format(new Date());
		String data2=simpleDateFormat2.format(new Date());
		
		
		System.out.println(data);
		System.out.println(data1);
		System.out.println(data2);
		
		
		
		
		
		
		
	}

}
