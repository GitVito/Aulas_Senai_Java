
public class Aplicacao { // classe main para aplicação dos métodos

	public static void main(String[] args) {

		ContaCorrente contacorrente = new ContaCorrente(); // objeto contacorrente instanciado. É da classe
															// ContaCorrente
		contacorrente.depositar(200); // depositar 200 reais no saldo da contacorrente
		contacorrente.transferir(350); // transferir 350 reais no saldo da contacorrente
		contacorrente.sacar(1000); // sacar 200 reais no saldo da contacorrente
		contacorrente.calcularSaldo(); // calcular saldo final
		System.out.println(); // pular linha

		ContaInvestimento containvestimento = new ContaInvestimento(); // objeto contacorrente instanciado. É da classe
																		// ContaInvestimento
		containvestimento.depositar(30); // depositar 30 reais no saldo da containvestimento
		containvestimento.transferir(40); // transferir 40 reais no saldo da containvestimento
		containvestimento.sacar(20); // sacar 20 reais no saldo da containvestimento
		containvestimento.calcularSaldo(); // calcular saldo final

	}

}