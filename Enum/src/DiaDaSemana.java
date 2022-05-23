
public enum DiaDaSemana { //Qualquer palavra/valor irá ficar constante, pois está dentro do Enum
	//Ao fazer  isso, internamente ele já foi construído, comisso você pode criar variáveis que apontam para ele, sendio que só é possível criar com o valor do mesmo tema
	//Pode ser comparado como uma array de constantes
	
	//Constantes
	
	DOMINGO(1), //Letra maiúscula sempre que for constante
	SEGUNDA(2), //Separe com vírgula, um ao lado do outro ou embaixo, após fazer o último, finalize com ponto e vírgula
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6), // === "()" parâmetros
	SABADO(7); 

	
		//Atributos//
	
			private int num; //Fala que este atributo pertence a estes de cima

	
			
			private DiaDaSemana(int num) { //Quando vocÊ cria o construtor, os   ali encima, vão sempre precisar de parâmetros
			this.num = num;
		}


			//Método Get
				public int getNum() {
					return num;
			}
			
			
					
			
	
}
