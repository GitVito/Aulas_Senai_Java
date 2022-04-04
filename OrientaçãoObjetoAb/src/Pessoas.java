
public class Pessoas {
	
	String nome;
	int numFigurinhas; //Global= está sendo atribuida dentro do método /Gravada em outro campo de memória, sem ser na stack
	
	void receber( int numFigurinhas) {
		//int x; //Só consegue enxergar dentro do metodo. Se você criou dentro do método ela existe só dentro do método.
		
			//Variável global- Todos os métodos dentro dessa classe vão enxergar ela.
	
		this.numFigurinhas +=  numFigurinhas;
		
		
		
		
		
	}
		
		void dar() {
			
			
		}
	
	
	
	


	
	}


