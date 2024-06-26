package pacote.cursodevdojo.javacore.formatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {

	public static void main(String[] args) {
		NumberFormat[] nf = new NumberFormat[4];
		nf[0] = NumberFormat.getInstance(new Locale("pt","BR"));
		nf[1] = NumberFormat.getInstance(Locale.US);
		nf[2] = NumberFormat.getInstance(Locale.ITALY);
		nf[3] = NumberFormat.getInstance(Locale.JAPAN);
		for(NumberFormat nF : nf) {
			System.out.println(nF.getMaximumFractionDigits());
			System.out.println(nF.getMaximumIntegerDigits());
			System.out.println(nF.getMinimumFractionDigits());
			System.out.println(nF.getMinimumIntegerDigits());
			nF.setMaximumFractionDigits(4);
			nF.setMaximumIntegerDigits(4);
			nF.setMinimumFractionDigits(1);
			nF.setMinimumIntegerDigits(1);
			System.out.println(nF.format(10_000_000));
		}
		NumberFormat[] nfc = new NumberFormat[4];
		nfc[0] = NumberFormat.getCurrencyInstance(new Locale("pt","BR"));
		nfc[1] = NumberFormat.getCurrencyInstance(Locale.US);
		nfc[2] = NumberFormat.getCurrencyInstance(Locale.ITALY);
		nfc[3] = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		for(NumberFormat nF : nfc) {
			System.out.println(nF.format(10_000_000.123123));
		}
		try {
		System.out.println("Numero formatado = "+ nf[0].parse("1000,00") );
		}catch(ParseException e){
			e.printStackTrace();
		}
	}
}
