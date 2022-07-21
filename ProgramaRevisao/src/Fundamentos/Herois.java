package Fundamentos;

public class Herois extends Personagens{

	private String classe;
	
	
//	public Herois(String nome, int vida, int forca, Raca raca) {
//		super(nome, vida, forca, raca);
//		// TODO Auto-generated constructor stub
//	}




	
	public Herois(String nome, int vida, int forca, Raca raca, String classe) {
		super(nome, vida, forca, raca);
		this.classe = classe;
	}





	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}





	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Classe: " + classe + "\n";
	}

	
	
	
}
