
public class ContaCorrente extends ContaBancaria{

	@Override //Sobrescrição do metodo = Overrride 
		  //Sobrescrevemos e podemos usar metodos criados na classe-mae, e assim adaptarmos da nossa forma.
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
