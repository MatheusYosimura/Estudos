package pacote.cursodevdojo.javacore.formatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {

	public static void main(String[] args) {
		Locale localeBrasil = new Locale("pt","BR");
		Locale localeItalia = new Locale("it","IT");
		Calendar c = Calendar.getInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeBrasil);
		System.out.println(df.format(c.getTime()));
		df = DateFormat.getDateInstance(DateFormat.FULL, localeItalia);
		System.out.println(df.format(c.getTime()));
		System.out.println(localeBrasil.getDisplayCountry());
		System.out.println(localeBrasil.getDisplayLanguage(localeItalia));
	}

}
