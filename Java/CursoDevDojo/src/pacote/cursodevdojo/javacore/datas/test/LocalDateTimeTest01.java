package pacote.cursodevdojo.javacore.datas.test;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.parse("2024-06-30");
		LocalTime lt = LocalTime.parse("01:14:59");
		LocalDateTime ldt1 = LocalDateTime.of(ld, lt);
		LocalDateTime ldt2 = LocalDateTime.now();
		LocalDateTime ldt3 = ld.atTime(lt);
		LocalDateTime ldt4 = lt.atDate(ld);
		System.out.println(ld);
		System.out.println(lt);
		System.out.println(ldt1);
		System.out.println(ldt2.plusHours(1));
		System.out.println(ldt3);
		System.out.println(ldt4);
	}

}
