package pacote.cursodevdojo.javacore.formatacao.test;

import java.util.Locale;

public class LocaleTest02 {
	public static void main (String[] args) {
		System.out.println(Locale.getDefault());
		for(String s : Locale.getISOCountries()) {
			System.out.println(s);
		}
		for(String s : Locale.getISOLanguages()) {
			System.out.println(s);
		}	}
}
