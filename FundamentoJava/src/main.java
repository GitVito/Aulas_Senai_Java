import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		//int x = 100;
		//double y = 200.3;
//		//short z = (short) 10000;
//		
//		int a = 0;
//		double b = 0;
//		
//		a= (int) y; //Casting Expl�cito, Voc� dizer para o eclipseque assume a responsabilidade por perder informa��o.
//		b= x; //Casting(escala��o) impl�cito, consegur passar o conteudo de uma vari�vel para outra sem perder nenhum dado.
//		//Aqui voc� n�o perder� informa��o,
//		
//		System.out.println(z);
//		System.out.println(b);
//		System.out.println(a);
		
//		int idadepessoa = 60;
//		
//		if (idadepessoa < 18) {
//			
//		System.out.println("Voc� n�o pode beber");
//		}
//			
//		
//		else if(idadepessoa < 60) { //Pode fazer quantas condi��es quiser
//			System.out.println("Bora tomar uma!");
//		}
//		else {
//			System.out.println("Quanto � a aposentadoria?");
//		}
//		
//		System.out.println("Voc� tem " + idadepessoa + " anos");
//		
		
//		int num = 8;
//		
//		switch (num) {
//			
//		case 1:
//			System.out.println("Domingo"); //O break � aquele que vai barrar 
//			break;
//		case 2:
//			System.out.println("Segunda-feira");
//			break;
//		case 3:
//			System.out.println("Ter�a-feira");
//			break;
//		case 4:
//			System.out.println("Quarta-feira");
//			break;
//		case 5:
//			System.out.println("Quinta-feira");	
//			break;
//		default:		 //Funciona como um else, caso nenhum dos casos for encontrados
//			System.out.println("Esse n�mero n�o representa um dia da semana.");
//		}
		
		
//		char caractere = 'a';		//String � um conjunto de caractere //Caso voc� coloque outro valor al�m do declarado para vari�vel, vai dar erro.
//		
//		switch (caractere) {
//			case 'a':
//				System.out.println("Seu caractere � a ");
//				break;
//			case 'b':
//				System.out.println("Seu caractere � b ");
//				break;
//			default:
//			System.out.println("Valor inv�lido");
//		
//		
//		}
		
//		String farol = "verde";
//		
//		 switch (farol) { //switch � o ESCOLHA CASO
//		 
//		 case "verde":
//			 System.out.println("ACELERA");
//			 break;
//		 case "amarelo":
//			 System.out.println("Calma e aten��o");
//			 break;
//		 case "vermelho":
//			 System.out.println("Pare!");	 
//			 break;
//		default:
//			System.out.println("Valor inv�lido!");
//		 
//		 }
		
		
//		int x=0;
//		while(x<10) { //Tudo que retornar verdadeiro ou falso � poss�vel ser colocado / //While � o ENQUANTO
//			 System.out.println(x); //Testa primeiro e depois faz
//			 x = x+1; //x ++; 	
//		}
//				
//		
//		x=0;
//		 do { //Faz primeiro e depois se for verdadeiro, repete
//			 System.out.println(x);
//			 x=x+1; 
//		 }while (x<10);
//		
// System.out.println(x);
		 
		 
		
		
		
//		for(int x=0; x<10; x++) { // se voc� criar a vari�vel aqui dentro, ela s� existe aqui dentro
//			System.out.println(x); //""Conte de 0 a 10""
//		}
		// x++ Significa: "Pega o valor que est� aqui dentro, adiciona 1" | "se quiser adicionar mais � x+=2" funciona tamb�m com * (multiplicar)
		// | 1= valor da vari�vel | 2= valor condicional | 3= incremento|
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Digte o n�mero da tabuada que voc� deseja:");
		 int x = a.nextInt();
		
		
		for (int y=x; y==x*10; y+=x) {

			System.out.println(y);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		}	
			

		
	}




