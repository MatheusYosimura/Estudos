package pacote.cursodevdojo.javacore.datas.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
	public static void main (String[] args) {
		LocalTime lt1 = LocalTime.now();
		LocalTime lt2 = LocalTime.now().plusHours(12).plusMinutes(40).plusSeconds(44);
		LocalDateTime ldt1 = LocalDateTime.now();
		LocalDateTime ldt2 = LocalDateTime.now().plusYears(5).plusMonths(3).plusDays(3);
		Duration d1 = Duration.between(lt1, lt2);
		Duration d2 = Duration.between(ldt1, ldt2);
		System.out.println(d1+"\n"+d2);
		System.out.println(Duration.ofDays(10));
	}
}
