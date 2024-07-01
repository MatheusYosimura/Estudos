package pacote.cursodevdojo.javacore.datas.test;
import java.time.LocalTime;

public class LocalTimeTest01 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(8,0,0);
		LocalTime now = LocalTime.now();
		System.out.println(time);
		System.out.println(now);
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		now = now.plusHours(3);
		System.out.println(now);
	}
}
