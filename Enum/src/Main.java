
public class Main {
		
	//Criação de constantes precisam da palavra "final"
	public static final double PI = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pi = Main.PI; //Para acessar a constante (Como ela é static, você faz dessa forma)
		
		 enum Sexo { //Você pode realizar um Enum dentro de uma classe, caso ele não seja tão complexo //V
				MASCULINO,
				FEMININO;
		}
		
		DiaDaSemana hoje = DiaDaSemana.DOMINGO ; 		//Só vai apontar para os do mesmo tipo / //Você só consegue guardar o endereço do objeto 
		//Para acessar você precisa utilizar o endereço (será a unica coisa que ele irá aceitar = os endereços que você determinou lá no Enum)

		
		
			int num = DiaDaSemana.SEGUNDA.getNum(); //Agora possui um método Get para capturar o valor que ele é
		//Vamos criar uma variável para armazenar o valor do Enum que criamos	
			System.out.println(num);
			
			
				String s = "TERCA";
				 hoje = DiaDaSemana.valueOf(s); //Pega String e procura na "coleçao", na lista de Enums, se há alguma String parecida ou igual, se houver, ele armazena na variavel "hoje"  (Recebe um argumento String)
	
				 System.out.println(hoje.getNum() ); //Mostrar informação que está em hoje
				
	
				 
				 
				 
			Sexo sexo = Sexo.FEMININO;
					sexo = Sexo.MASCULINO;
	
	
	
	}
	
	

}
