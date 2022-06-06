
public class Conta {

	String nome;
	int idade;
	Object endereco; //Do tipo Object
	
	
	//Metodos Get and Setter
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override //Override, que sobrescreve o metodo toString / Override serve para editarmos um metodo
	public String toString() {
		return "Conta [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + "]";
	}

	
	
	
}
