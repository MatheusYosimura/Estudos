package pacote.cursodevdojo.javacore.datas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {

	public static void main(String[] args) {
		Period p1 = Period.between(LocalDate.now(), LocalDate.now().plusYears(2).plusMonths(3).plusDays(4));
		System.out.println(p1);
		System.out.println(Period.of(3, 2, 1));
		System.out.println(Period.ofWeeks(123));
		System.out.println(Period.ofWeeks(123).getMonths());
		System.out.println(LocalDate.now().until(LocalDate.now().plusYears(3).plusDays(101), ChronoUnit.WEEKS));
	}

}
