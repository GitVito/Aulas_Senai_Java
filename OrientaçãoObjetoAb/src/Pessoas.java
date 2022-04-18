
public class Pessoas {

	String nome;
	int numFigurinhas; // Global= est� sendo atribuida dentro do m�todo /Gravada em outro campo de
						// mem�ria, sem ser na stack

	void receber(int numFigurinhas) {
		// int x; //S� consegue enxergar dentro do metodo. Se voc� criou dentro do
		// m�todo ela existe s� dentro do m�todo.

		// Vari�vel global- Todos os m�todos dentro dessa classe v�o enxergar ela.

		this.numFigurinhas += numFigurinhas; // soma o valor // O this � usado para referenciar a um atributo externo
												// fora do metodo. Por exemplo ser dentro de um m�todo se estiver
												// dois atributos com o mesmo nome oque estiver com a palavra "this"
												// estar� se referenciando a um atributo fora do metodo.

	}

	boolean dar(int numFigurinhas, Pessoas pessoa) {

		boolean msg;

		if (numFigurinhas > this.numFigurinhas) {

			System.out.println("Voc� n�o tem figurinhas para somar na vida da " + pessoa.nome);
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
