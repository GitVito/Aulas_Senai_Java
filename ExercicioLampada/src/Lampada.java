
public class Lampada {
 
	private boolean ligada;
	
	
	
//	public Lampada(String msg) {
//		
//		if (ligada==true) {
//		this.msg = "Lampada ligada"; //This = Usado para referenciar um atributo fora do metodo
//	 }
//		else {
//			this.msg = "Lampada desligada";
//		}
//		
//		
//	}


	public Lampada(boolean ligada) { //construtor, podemos gerar ele apertando o botão direito do mouse, indo em source e clicar na opçao para criar construtores
	
	}

	
	public void desligar() {
		this.ligada = false;
		
	}
	
	public void ligar () {
		this.ligada = true;
		
	}
	
	public void imprimir() {
		
	}
}
