
public class ContaCorrente extends ContaBancaria { // classe p�blica que herda a classe-m�e ContaBancaria

	@Override
	public double calcularSaldo() { // override do m�todo calcular saldo da superclasse.
		double saldofinal; // vari�vel criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 0.90; // f�rmula para calcular o saldo menos 10%

		System.out.println("Seu saldo final na Conta Corrente � R$ " + saldofinal); // mostrando na tela o saldo final
																					// da conta corrente
		return saldofinal; // retorno da vari�vel
	}

}