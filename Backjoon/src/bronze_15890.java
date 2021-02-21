import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class bronze_15890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1.본선 날짜  2018 07 29
		
		//2.입력이 없어서 
		
		//3.Calendar 
		
		
		SimpleDateFormat simFormat =new SimpleDateFormat("yyyyMMdd");
		
		
		Date time=new Date();
		
		String today=simFormat.format(time);
		
		
		Calendar cal=new GregorianCalendar(Locale.KOREA);
		
		
		cal.add(Calendar.YEAR, -2);
		cal.add(Calendar.MONTH, -7);
		cal.add(Calendar.DATE, +8);
		
		
		String yest=simFormat.format(cal.getTime());
		
		System.out.println(yest);
	}

}
