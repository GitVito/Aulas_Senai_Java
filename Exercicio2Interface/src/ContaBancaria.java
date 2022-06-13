public abstract class ContaBancaria { // classe abstrata n�o pode ser instanciada
	// classe abtsrata n�o pode ter um objeto criado a partir de sua instancia��o

	private double saldo = 10; // atributo vis�vel apenas para as subclasses

	
	public double depositar(double valor) { // m�todo para somar um valor ao saldo inicial. O par�metro � o valor que
											// ser� somado.
		saldo = saldo + valor; // f�rmula da soma
		System.out.println("Dep�sito de R$ " + valor + " realizado.");
		return saldo;

	}

	public double sacar(double valor) { // m�todo para sacar um valor do saldo inicial. O par�metro � o valor que ser�
										// sacado.

		if (valor > saldo) { // teste para saber se tem valor suficiente para sacar.
			System.out.println("Voc� n�o tem valor sufuciente para fazer esse saque. Seu saldo atual � " + saldo);
		} else {
			saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado.");

		}

		return saldo;

	}

	public double transferir(double valor) { // m�todo para transerir um valor do saldo inicial. O par�metro � o valor
												// que ser� trasnferido.

		if (valor > saldo) { // teste para saber se tem valor suficiente para trasnsferir.
			System.out.println("Voc� n�o tem valor sufuciente para fazer essa transfer�ncia. Seu saldo atual � " + saldo);
		} else {
			saldo = saldo - valor;
			System.out.println("Transfer�ncia de R$ " + valor + " realizado.");

		}
		return saldo;
	}

	public abstract double calcularSaldo(); // regra do c�lculo do saldo final

	// Getters e Setters para ter acesso aos atributos privados
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}