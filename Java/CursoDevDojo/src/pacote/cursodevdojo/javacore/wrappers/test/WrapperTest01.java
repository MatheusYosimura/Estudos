package pacote.cursodevdojo.javacore.wrappers.test;

public class WrapperTest01 {
	public static void main (String[] args) {
		Byte byyte = 127;
		Boolean bool = false;
		Short shoort = 1;
		Integer integer = 10;
		Long loong = 10L;
		Float flooat = 10f;
		Double douuble = 10D;
		Character character = 'W';
		integer = Integer.parseInt("11");
		bool = Boolean.parseBoolean("True");
		System.out.println(Character.isUpperCase(character));
		System.out.println(Character.isDigit(character));
	}
}
