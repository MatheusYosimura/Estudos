package pacote.cursodevdojo.javacore.datas.test;
import java.util.*;
public class CalendarTest01 {
	public static void main(String [] args) {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		System.out.println(date);
		if(c.getFirstDayOfWeek() == Calendar.SUNDAY) {
			System.out.println("Primeiro dia da semana é Domingo");
		}
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.DAY_OF_YEAR));
		c.add(Calendar.DAY_OF_MONTH, 10);
		date = c.getTime();
		System.out.println(date);
		c.add(Calendar.HOUR, 12);
		date = c.getTime();
		System.out.println(date);
		c.roll(Calendar.HOUR, 12);
		date = c.getTime();
		System.out.println(date);
	}
}
