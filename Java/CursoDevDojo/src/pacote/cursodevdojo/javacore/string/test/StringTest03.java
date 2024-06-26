package pacote.cursodevdojo.javacore.string.test;

public class StringTest03 {
	public static void main (String[] args) {
		long inicio = System.currentTimeMillis();
		StringConcat(1000000);
		long fim = System.currentTimeMillis();
		System.out.println(fim-inicio);
		inicio = System.currentTimeMillis();
		StringBuilderConcat(1_000_000);
		fim = System.currentTimeMillis();
		System.out.println(fim-inicio);
		inicio = System.currentTimeMillis();
		StringBufferConcat(1_000_000);
		fim = System.currentTimeMillis();
		System.out.println(fim-inicio);
	}
	public static void StringConcat(int tamanho) {
		String s = "";
		for(int i=0;i<tamanho;i++) {
			s+=i;
		}
	}
	
	public static void StringBuilderConcat(int tamanho) {
		StringBuilder sbd = new StringBuilder(tamanho);
		for(int i=0;i<tamanho;i++) {
			sbd.append(i);
		}
	}
	
	public static void StringBufferConcat(int tamanho) {
		StringBuffer sbf = new StringBuffer(tamanho);
		for(int i=0;i<tamanho;i++) {
			sbf.append(i);
		}
	}
}
