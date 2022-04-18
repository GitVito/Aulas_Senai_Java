
public class Pessoas {

	String nome;
	int numFigurinhas; // Global= está sendo atribuida dentro do método /Gravada em outro campo de
						// memória, sem ser na stack

	void receber(int numFigurinhas) {
		// int x; //Só consegue enxergar dentro do metodo. Se você criou dentro do
		// método ela existe só dentro do método.

		// Variável global- Todos os métodos dentro dessa classe vão enxergar ela.

		this.numFigurinhas += numFigurinhas; // soma o valor // O this é usado para referenciar a um atributo externo
												// fora do metodo. Por exemplo ser dentro de um método se estiver
												// dois atributos com o mesmo nome oque estiver com a palavra "this"
												// estará se referenciando a um atributo fora do metodo.

	}

	boolean dar(int numFigurinhas, Pessoas pessoa) {

		boolean msg;

		if (numFigurinhas > this.numFigurinhas) {

			System.out.println("Você não tem figurinhas para somar na vida da " + pessoa.nome);
			msg = false;
		}

		else {

			this.numFigurinhas -= numFigurinhas;

			pessoa.receber(numFigurinhas);
			msg = true;
		}

		return msg;

	}

}
