public abstract class ContaBancaria { // classe abstrata não pode ser instanciada
	// classe abtsrata não pode ter um objeto criado a partir de sua instanciação

	private double saldo = 10; // atributo visível apenas para as subclasses

	
	public double depositar(double valor) { // método para somar um valor ao saldo inicial. O parâmetro é o valor que
											// será somado.
		saldo = saldo + valor; // fórmula da soma
		System.out.println("Depósito de R$ " + valor + " realizado.");
		return saldo;

	}

	public double sacar(double valor) { // método para sacar um valor do saldo inicial. O parâmetro é o valor que será
										// sacado.

		if (valor > saldo) { // teste para saber se tem valor suficiente para sacar.
			System.out.println("Você não tem valor sufuciente para fazer esse saque. Seu saldo atual é " + saldo);
		} else {
			saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado.");

		}

		return saldo;

	}

	public double transferir(double valor) { // método para transerir um valor do saldo inicial. O parâmetro é o valor
												// que será trasnferido.

		if (valor > saldo) { // teste para saber se tem valor suficiente para trasnsferir.
			System.out.println("Você não tem valor sufuciente para fazer essa transferência. Seu saldo atual é " + saldo);
		} else {
			saldo = saldo - valor;
			System.out.println("Transferência de R$ " + valor + " realizado.");

		}
		return saldo;
	}

	public abstract double calcularSaldo(); // regra do cálculo do saldo final

	// Getters e Setters para ter acesso aos atributos privados
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}