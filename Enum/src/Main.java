
public class Main {
		
	//Cria��o de constantes precisam da palavra "final"
	public static final double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = Main.PI; //Para acessar a constante (Como ela � static, voc� faz dessa forma)
		
		 enum Sexo { //Voc� pode realizar um Enum dentro de uma classe, caso ele n�o seja t�o complexo //V
				MASCULINO,
				FEMININO;
		}
		
		DiaDaSemana hoje = DiaDaSemana.DOMINGO ; 		//S� vai apontar para os do mesmo tipo / //Voc� s� consegue guardar o endere�o do objeto 
		//Para acessar voc� precisa utilizar o endere�o (ser� a unica coisa que ele ir� aceitar = os endere�os que voc� determinou l� no Enum)

		
		
			int num = DiaDaSemana.SEGUNDA.getNum(); //Agora possui um m�todo Get para capturar o valor que ele �
		//Vamos criar uma vari�vel para armazenar o valor do Enum que criamos	
			System.out.println(num);
			
			
				String s = "TERCA";
				 hoje = DiaDaSemana.valueOf(s); //Pega String e procura na "cole�ao", na lista de Enums, se h� alguma String parecida ou igual, se houver, ele armazena na variavel "hoje"  (Recebe um argumento String)
	
				 System.out.println(hoje.getNum() ); //Mostrar informa��o que est� em hoje
				
	
				 
				 
				 
			Sexo sexo = Sexo.FEMININO;
					sexo = Sexo.MASCULINO;
	
	
	
	}
	
	

}
