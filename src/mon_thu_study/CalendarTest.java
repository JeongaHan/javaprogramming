package mon_thu_study;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

	public static void printCalendar(Calendar c) {
		System.out.println("=======================");
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.HOUR_OF_DAY));
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
	}
	
	public static void main(String[] args) {
		long millis = System.currentTimeMillis();
		System.out.println(millis/1000/24/60/60);
		
		Date d = new Date();
		System.out.println(d);
		Date dd = new Date(d.getTime()+24*60*60*1000);
		System.out.println(dd);
		
		Calendar birth = Calendar.getInstance();
		birth.set(1996,10,4);
		printCalendar(birth);
		
		Calendar today = Calendar.getInstance();
		printCalendar(today);
		long minus = today.getTimeInMillis()-birth.getTimeInMillis();
		System.out.println(minus);
		System.out.println(minus/1000/24/60/60);
	}

}
