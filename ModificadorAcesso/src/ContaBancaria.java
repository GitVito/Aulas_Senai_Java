
public class ContaBancaria {

	private int numConta;
	private boolean ativo;
	private double saldo;
	
	
	public ContaBancaria() { //Construtor
		ativo = true;
		saldo = 1.0;
	}
	
	
	public void Receber(double valor) {
		saldo += valor;
	}
	
	

	public ContaBancaria(boolean ativo, double saldo) { //Construtor
		this.ativo = ativo; //This =
		this.saldo = saldo;
	}


	public double saldo () {
		return saldo;
	}
	
	
	public void dar (double valor) {
		
	if (saldo >= valor) 	
		saldo -= valor;
	}
	
}

//	else {System.out.println("Ímpossivel realizar a operação");}
//	
//	
//	
//	
//	
//	}
//	
	
	
