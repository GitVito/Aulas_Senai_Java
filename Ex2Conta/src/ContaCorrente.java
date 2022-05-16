
public class ContaCorrente extends ContaBancaria{

	@Override
	public void depositar(double x) {
		saldo += x;
		
	}

	@Override
	public void sacar(double x) {
	
		saldo -= x;
	}

	@Override
	public void transferir(double x) {
		
		
	}

	
}
