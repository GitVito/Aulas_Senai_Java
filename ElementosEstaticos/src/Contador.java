
public class Contador {
	static int valor;
	
	
	static {
		valor = 1;
	}
	
	public static void incrementar() {
		valor ++; // ++ adiciona 1
	}


//	public Contador() { Como agora n�o temos objeto, ele � inutil
//		this.valor = 1;
//	}


	public static int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
	
	
	
}
