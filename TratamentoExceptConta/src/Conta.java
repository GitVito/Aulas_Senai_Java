
public class Conta {

	double saldo;
	double limite;

	public Conta(double d, double e) {
		// TODO Auto-generated constructor stub
	}



	public double depositar(double valor) {
		
		saldo = saldo + valor; 
		System.out.println("Dep�sito de R$ " + valor + " realizado.");
		return saldo;

	}

	
	
	public double transferir(double valor) { 
		

		if (valor > saldo) { 
			System.out
					.println("Voc� n�o tem valor sufuciente para fazer essa transfer�ncia. Seu saldo atual � " + saldo);
		} else {
			saldo = saldo - valor;
			System.out.println("Transfer�ncia de R$ " + valor + " realizado.");

		}
		return saldo;
	}

	
	
	public double sacar(double valor) {
	

		if (valor > saldo) {
			System.out.println("Voc� n�o tem valor sufuciente para fazer esse saque. Seu saldo atual � " + saldo);
		} else {
			saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado.");

		}

		return saldo;

	}
	
	
	
	
	// aaaa
	
	
	
	public void sacarEX(double valor) throws ContaException { //com  o trows vc diz que ele pode da um erro
		
		if (this.saldo < valor) {
			throw new ContaException("Saldo insuficiente");
		}
		else if ((this.saldo - valor) < limite*-1) {
			throw new ContaException("Limite insuficiente"); //Vai lan�ar uma nova	exce��o. e se caso ocorrer essa exce��o, est� msg aparecer�, pelo tratamento que n�s j� fizemos		
		}
	
		this.saldo -=valor;
	
	}
	
	
	
	
	
	
	//--------Numeros magicos--------
	
		public int sacarMN(double valor) {

		 if((this.saldo < valor) && (this.saldo >= limite*-1)) {
			return 101;
		}
		else if (this.saldo >=limite*-1) {
			return 102;
		
		}
		 return 100;
		
		}
		
		
		
		public int transferirMN(Cliente cliente, double valor) {
			
			if((this.saldo < valor) && (this.saldo >= limite*-1)) {
				this.saldo-=valor;
				return 101;
			}
			else if ((this.saldo < valor) && (this.saldo >= limite*-1)) {
			return 102;
		}
			this.saldo -=valor;
			cliente.getConta().depositar(valor);
			return 100;

		}
			
			//--------

	// Get and Set

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
