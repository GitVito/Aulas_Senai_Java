
public class Pessoa {

	String nome;
	int idade;
	Endereco endereco;
	Sexo sexo;

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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
	// Usando o Split

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + ", sexo=" + sexo + "]";
	}

	public Pessoa(String texto) {
	
	String[] arrayAuxiliar0 = texto.split(",");  //Nós fazemos uma array (Matriz), e separamos a frase acima em "casinhas", e com o split determinamos onde será o final e o inicio de uma nova casinha, logo pegamos como referência a arrayAuxiliar0, sempre que formos editar o texto.
	String[] arrayAuxiliar1 = arrayAuxiliar0[0].split("=");
	this.nome = arrayAuxiliar1[1].trim();
	
	String[] arrayAuxiliar2 = arrayAuxiliar0[1].split("=");
	this.idade = Integer.parseInt(arrayAuxiliar2[1].trim());
		
	String[] arrayAuxiliar3 = arrayAuxiliar0[5].split("=");
	this.sexo = Sexo.valueOf(arrayAuxiliar3[1].trim());
	
	Endereco en = new Endereco();
		this.endereco = en;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub
	
	}

	
	
	
	
	
	
	
	
	
	
	
}
