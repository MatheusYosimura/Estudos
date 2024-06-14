package pacote.cursodevdojo.javacore.exception.runtime.test;

public class RuntimeExceptionTest03 {

	public static void main(String[] args) {
		abreConexao();
	}
	private static void abreConexao() {
		try {
			System.out.println("Abre conexão");
			System.out.println("Utiliza Recurso");
			return; // finally executado antes do return
			//throw new Exception("Exceção");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Fecha Conexão");
		}
	}

}
