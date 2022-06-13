
public class ContaInvestimento extends ContaBancaria { // classe pública que herda a classe-mãe ContaBancaria

	@Override
	public double calcularSaldo() { // override do método calcular saldo da superclasse.

		double saldofinal; // variável criada para guardar o valor do saldo final

		saldofinal = getSaldo() * 1.05; // fórmula para calcular o saldo acrescido de 5%

		System.out.println("Seu saldo final na Conta investimento é R$ " + saldofinal); // mostrando na tela o saldo
																						// final da conta corrente
		return saldofinal; // retorno da variável

	}

}