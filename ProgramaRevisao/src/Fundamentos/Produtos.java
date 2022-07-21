package Fundamentos;

public class Produtos {
	
	private  String nome;
	private  double valor;
	private  double desconto;
	
	
	
	//Get and Set//
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	//-----//
	
	
	public double calcularDesconto() {
		return this.valor =  valor-valor*desconto/100;
		
	}
	
	
	@Override
	public String toString() {
		return "\n Produto: " + nome + "\n Desconto: " + desconto + "% \n Valor final com desconto (Que sera pago): R$" + valor + " reais";
	}

}
