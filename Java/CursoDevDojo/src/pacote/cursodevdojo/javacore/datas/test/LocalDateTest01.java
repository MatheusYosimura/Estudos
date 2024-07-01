package pacote.cursodevdojo.javacore.datas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
	public static void main(String[] args) {
		LocalDate data = LocalDate.of(2000, Month.MARCH, 1);
		LocalDate agora = LocalDate.now();
		System.out.println(data.getDayOfMonth());
		System.out.println(data.getMonth());
		System.out.println(data.getYear());
		System.out.println(data);
		System.out.println(agora);
		agora = agora.plusDays(3);
		agora = agora.plusMonths(3);
		agora = agora.plusYears(3);
		System.out.println(agora);
	}
}
