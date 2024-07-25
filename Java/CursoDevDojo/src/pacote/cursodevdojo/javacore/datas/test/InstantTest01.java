package pacote.cursodevdojo.javacore.datas.test;

import java.time.Instant;

public class InstantTest01 {

	public static void main(String[] args) {
		Instant ins = Instant.now();
		System.out.println(ins);
		System.out.println(ins.getEpochSecond());
		System.out.println(ins.getNano());
	}
}
