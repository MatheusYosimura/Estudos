package pacote.cursodevdojo.javacore.formatacao.test;
import java.text.*;
import java.util.Date;

public class SimpleDataFormatTest01 {
	public static void main (String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("'Goiânia, 'd' de 'MMMM' de 'y");
		System.out.println(sdf.format(new Date()));
		try {
			System.out.println(sdf.parse("Goiânia, 01 de março de 2000"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
