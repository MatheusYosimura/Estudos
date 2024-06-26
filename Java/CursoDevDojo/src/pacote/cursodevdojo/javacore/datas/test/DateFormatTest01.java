package pacote.cursodevdojo.javacore.datas.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
	public static void main (String[] args) {
		Calendar c = Calendar.getInstance();
		DateFormat df = DateFormat.getInstance();
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateInstance();
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getTimeInstance();
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateTimeInstance();
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(c.getTime()));
	}
}
