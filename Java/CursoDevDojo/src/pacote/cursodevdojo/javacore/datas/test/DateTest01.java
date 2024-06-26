package pacote.cursodevdojo.javacore.datas.test;

import java.util.*;

public class DateTest01 {
	public static void main(String[] args) {
		Date data = new Date();
		System.out.println(data);
		data.setTime(data.getTime() + 3600000L);
		System.out.println(data);
	}
}
