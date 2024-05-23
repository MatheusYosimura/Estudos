package pacote.cursodevdojo.javacore.enumeracao.model;

public enum TipoPagamento{
	DEBITO{
		public double calculaDesconto(double valor) {
			return valor*0.1;
		}
	},CREDITO{
		public double calculaDesconto(double valor) {
			return valor*0.05;
		}
	};
	
	public abstract double calculaDesconto(double valor);
}
