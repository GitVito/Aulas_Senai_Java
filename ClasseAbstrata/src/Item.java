
public abstract class Item {
	private int posicaoX = 1;
	private int posicaoY = 1;
	
	public abstract void pegar() ;  //Se o método for abstrato, todas as subclasses precisam herdar este método/ Àqueles que herdarem a classe Item precisam do método
		
	
	//Getter and Setter//

	public int getPosicaoX() {
		return posicaoX;
	}

	public void setPosicaoX(int posicaoX) {
		this.posicaoX = posicaoX;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public void setPosicaoY(int posicaoY) {
		this.posicaoY = posicaoY;
	}
	
	//Getter and Setter//
	
}
