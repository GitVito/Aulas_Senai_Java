
public class Rota {
	
	public void ir(Automovel automovel) { //Da interface voc� enxerga os m�todos
		//Neste m�todo voc� n�o enxerga Automovel, mas serve para ser utilizado de forma geral
		
		automovel.acelerar();
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.virarDireita();
	}

}
