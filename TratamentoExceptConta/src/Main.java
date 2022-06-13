
public class Main {

	public static void main(String[] args) {
		

		Conta conta1 = new Conta(1200.0, 100.0);
		Conta conta2 = new Conta(1500.0, 200.0);
		
		
		
		Cliente cliente1 = new Cliente("Rafael", 30000, conta1);
		Cliente cliente2 = new Cliente("Gislene", 40000, conta2);
		
		
		if(cliente1.getConta().sacar(100)==true) {
			System.out.println("Saque realizado com sucesso");
		} else {
			System.out.println("Saque não realizado porque seu saldo é insuficiente");

		}
		System.out.println("Seu saldo é de : " + cliente1.getConta().getSaldo());
		
		
		
		switch (cliente1.getConta().sacarMN(100))	{
			case 100: System.out.println("Saque realizado com sucesso!");
			break;
			case 101: System.out.println("Saque realizado com sucesso, mas você está usando seu limite");
			break;
			case 102: System.out.println("Operção não realizada por você não ter limite suficiente");
			break;
		}
		
		
		
		//----------------teste com Exception--------------------------------------------------
		
		try {
			cliente1.getConta().sacarEX(100);		//No nosso caso queremos tratar, ent será sunround trycat, 	//throws declaration : quem me chamou que vai se preocupar com esse problema
		} catch (ContaException e) {
			e.printStackTrace(); //printa na StackTrace
		
			System.out.println("Não foi possível realizar a operação" + e.getMessage());
		} 	//Força o programador a ver que tem um erro, pois o throw diz que pode dar algo errado
		
	}
	


}
