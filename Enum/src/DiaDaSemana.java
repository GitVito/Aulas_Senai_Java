
public enum DiaDaSemana { //Qualquer palavra/valor ir� ficar constante, pois est� dentro do Enum
	//Ao fazer  isso, internamente ele j� foi constru�do, comisso voc� pode criar vari�veis que apontam para ele, sendio que s� � poss�vel criar com o valor do mesmo tema
	//Pode ser comparado como uma array de constantes
	
	//Constantes
	
	DOMINGO(1), //Letra mai�scula sempre que for constante
	SEGUNDA(2), //Separe com v�rgula, um ao lado do outro ou embaixo, ap�s fazer o �ltimo, finalize com ponto e v�rgula
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6), // === "()" par�metros
	SABADO(7); 

	
		//Atributos//
	
			private int num; //Fala que este atributo pertence a estes de cima

	
			
			private DiaDaSemana(int num) { //Quando voc� cria o construtor, os   ali encima, v�o sempre precisar de par�metros
			this.num = num;
		}


			//M�todo Get
				public int getNum() {
					return num;
			}
			
			
					
			
	
}
