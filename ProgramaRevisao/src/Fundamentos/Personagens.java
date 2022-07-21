package Fundamentos;

public class Personagens {
	
	protected String nome;
	protected int vida;
	protected int forca;
	protected Raca raca;
	
	
	
	
	public Personagens(String nome, int vida, int forca, Raca raca) {
		this.nome = nome;
		this.vida = vida;
		this.forca = forca;
		this.raca = raca;
	}
	
	
	
	
	
	//GET AND SETTER//
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public Raca getRaca() {
		return raca;
	}
	public void setRaca(Raca raca) {
		this.raca = raca;
	}

	//------//
	
	
	
	public void atacar( int forca, Personagens personagem) {
		personagem.vida = personagem.vida-forca;
		
	}





	@Override
	public String toString() {
		return "\n Nome: " + nome + "\n Vida: " + vida + "\n Forca: " + forca + "\n Raca: " + raca + "\n";
	}
	
	
	
	
	
}
