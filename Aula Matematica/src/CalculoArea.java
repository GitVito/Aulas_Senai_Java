
public class CalculoArea {

	//Métodos para o calculo da area de cada forma geométrica
	//Usando sobrecarga de métodos, ou seja, metodos com o mesmo nome, contudo, recebem parâmetros diferentes(um ou mais), assim que será diferenciado

	int CalcularArea(int x) { //Quadrado
	//Metodo irá retornar int, nome do método é "CalcuclarArea", e possui um parâmetro inteiro	
		return x*2; //O retorno sera o valor x multiplicado por 2
		
		
	}
	
	double CalcularArea(double a, double b) { //Triangulo
		
		return a*b /2; //O retorno será o valor a e b, somados, dividido por 2
		
	}
	
	int CalcularArea(int d, int e) { //Retangulo
		
		return d*e; //Retorno será "d" multiplicado por "e" 
		
	}
	
	
	
	
}
