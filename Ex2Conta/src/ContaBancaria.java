
public abstract class ContaBancaria {
	
	protected double saldo = 100; //Atributos protegidos definem a visibilidade apenas para a própria classe, e para outras estendidas
	
	
	//Metodos
	
	public void depositar(double x) {
		
	}
	
	public void sacar(double x) {
		
	}
	
	public void transferir(double x) {
		
	}
	
	
	//Get and Set
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//fim get set
	
	
	
	
}
