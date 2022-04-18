
public class Main {

	public static void main(String[] args) {

		Pessoas pessoa1 = new Pessoas();

		pessoa1.nome = "Victor";
		pessoa1.numFigurinhas = 1; // Figurinhas de Victor

		pessoa1.receber(10); // Victor recebeu mais figurinhas

		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numFigurinhas);

		Pessoas pessoa2 = new Pessoas();

		pessoa2.nome = "Gisele";
		pessoa2.numFigurinhas = 10; // Figurinhas de Gisele

		System.out.println(pessoa2.nome);
		System.out.println(pessoa2.numFigurinhas); // cópia de endereço, as duas variáveis possuem os mesmos endereços.

		int darFig = 12;

		// boolean msg = pessoa1.dar(1, pessoa2); //Você pode criar a variável e
		// conectar diretamente ao método.
		pessoa1.dar(darFig, pessoa2);

		if (darFig < pessoa2.numFigurinhas) { // 2 metodos 1-Usar uma variável para armazenar o valor da quantidade de
												// figurinhas.
												// 2-Usar valor boleano, verdadeiro ou falso
			// if (msg==true) {
			System.out.println();
			System.out.println("Resultado da troca de figurinhas:");
			System.out.println();

			System.out.println(pessoa1.nome);
			System.out.println(pessoa1.numFigurinhas);

			System.out.println(pessoa2.nome);
			System.out.println(pessoa2.numFigurinhas);

		}

	}

}
