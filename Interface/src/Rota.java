
public class Rota {
	
	public void ir(Automovel automovel) { //Da interface você enxerga os métodos
		//Neste método você não enxerga Automovel, mas serve para ser utilizado de forma geral
		
		automovel.acelerar();
		automovel.virarDireita();
		automovel.virarEsquerda();
		automovel.virarDireita();
	}

}
