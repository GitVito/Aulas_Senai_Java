package Fundamentos;

public class Funcionarios {
	
	private String nome;
	private double cpf;
	private double salario;
	
		
	
	
	 
	
	
	
	
	
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}





	@Override
	public String toString() {
		return "Funcionario: " + nome + "\n De cpf: " + cpf + "\n Tem salario de: " + salario + "\n";
	}
	

}
