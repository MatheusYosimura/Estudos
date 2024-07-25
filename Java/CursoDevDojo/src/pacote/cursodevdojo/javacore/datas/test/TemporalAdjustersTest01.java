package pacote.cursodevdojo.javacore.datas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {

	public static void main(String[] args) {
		/*LocalDate ld = LocalDate.now();
		System.out.println(ld.with(ChronoField.DAY_OF_MONTH, 10));
		System.out.println(ld.withMonth(2));
		System.out.println(ld.withDayOfMonth(4));
		System.out.println(ld.withDayOfYear(365));
		
		System.out.println(ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));		
		System.out.println(ld.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)).getDayOfWeek());		
		System.out.println(ld.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)));		
		System.out.println(ld.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY)).getDayOfWeek());			
		System.out.println(ld.with(TemporalAdjusters.firstDayOfMonth()));	
		System.out.println(ld.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek());		
		System.out.println(ld.with(TemporalAdjusters.lastDayOfYear()));	
		System.out.println(ld.with(TemporalAdjusters.lastDayOfYear()).getDayOfWeek());
		*/
		proximoDiaUtil(LocalDate.now());
	}
	
	public static void proximoDiaUtil (LocalDate ld) {
		LocalDate aux = ld.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		int dif = (int)ChronoUnit.DAYS.between(ld, aux);
		if(dif <=4) {
			System.out.println(" Próximo dia útil = "+aux+" -> "+aux.getDayOfWeek());
		}else {
			System.out.println("Próximo dia útil = "+ld.plusDays(1)+" -> "+ld.plusDays(1).getDayOfWeek());
		}
	}

}
