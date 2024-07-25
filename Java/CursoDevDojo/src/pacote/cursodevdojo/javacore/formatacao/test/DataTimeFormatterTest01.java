package pacote.cursodevdojo.javacore.formatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeFormatterTest01 {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(ld1.format(DateTimeFormatter.ISO_DATE));
		LocalDate ld2 = LocalDate.parse("20240703",DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(ld2);
		
		LocalDateTime ldt1 = LocalDateTime.now();
		System.out.println(ldt1.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(ldt1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
		LocalDateTime ldt2 = LocalDateTime.parse("2024-07-03T22:41:57.605", DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(ldt2);
		
		DateTimeFormatter formatBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld1.format(formatBrasil));
		LocalDate ldt3 = LocalDate.parse("14/10/2002",formatBrasil);
		System.out.println(ldt3);

		DateTimeFormatter formatGermany = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
		System.out.println(ld1.format(formatGermany));
		LocalDate ldt4 = LocalDate.parse("14.Juli,2022",formatGermany);
		System.out.println(ldt3);

	}

}
