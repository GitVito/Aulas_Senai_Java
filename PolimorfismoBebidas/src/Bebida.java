
public class Bebida {
	private String nome;
	private static boolean aquecer;
	
	
	public Bebida(String nome, boolean aquecer) { //Construtor
		super();
		this.nome = nome;
		this.aquecer = aquecer;
	}

	//-----Getter and Setter//-----
	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public boolean isAquecer() {
		return aquecer;
	}


	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	}
	//-----Fechamento Getter and Setter//-----
	
	public void preparar(){  	//método preparar/ Sei que toda bebida vai ser preparada, só não sei como, mas eu digo que vai ser preparada, para conectar com cada classe, depois só fazer o Override para especificar em uma determinada classe
		
			System.out.println("Pegando copo");
		if (Bebida.aquecer==true) {
			System.out.println("Colocando " + nome + " no copo");
		} else {
			System.out.println("Colocando gelo no copo");
			System.out.println("Colocando Refrigerante");
		}
		
	} //Fim do metodo preparar
	
	
	

} //Fechamento geral
