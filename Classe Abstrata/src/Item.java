
public abstract class Item {
	private int posicaoX = 1; //Atributos privados, somente visíveis para a classe em que eles residem.
	private int posicaoY = 1;
	
	public abstract void pegar() ;  //Se o método for abstrato, todas as subclasses precisam herdar este método/ Àqueles que herdarem a classe Item precisam do método
		
	
	//Getter and Setter//

	public int getPosicaoX() { //metodo get é usado para "pegar", com ele acessamos atributos de forma segura
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) { //metodo set é usado para "setar" uma valor ao atributo, usado para alterar o valor de um determinado atributo. Usando este metodo podemos acessar os atributos de uma classe de forma segura
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	// fim do Getter and Setter//
	
}
