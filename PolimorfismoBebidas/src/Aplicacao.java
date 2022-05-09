
public class Aplicacao {

	public static void main(String[] args) {
		Preparador preparador = new Preparador();
		
		LeiteQuente leiteQuente = new LeiteQuente();
		preparador.prepararBebida(leiteQuente);
		
		Refigerante refigerante = new Refigerante();
		preparador.prepararBebida(refigerante);
		

	}

}
