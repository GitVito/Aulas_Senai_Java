
public class ContaInvestimento extends ContaBancaria { // classe p�blica que herda a classe-m�e ContaBancaria

	@Override
	public double calcularSaldo() { // override do m�todo calcular saldo da superclasse.

		double saldofinal; // vari�vel criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 1.05; // f�rmula para calcular o saldo acrescido de 5%

		System.out.println("Seu saldo final na Conta investimento � R$ " + saldofinal); // mostrando na tela o saldo
																						// final da conta corrente
		return saldofinal; // retorno da vari�vel

	}

}