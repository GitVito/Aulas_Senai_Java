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
		
		
		//--___----___Tabuada--___----___\\
//		
//		Scanner a = new Scanner(System.in);
//		
//		System.out.println("Digte o n�mero da tabuada que voc� deseja:");
//		 int y = a.nextInt();
//		
//		
//		for (int x=0; x<=10; x++) {
//
//			System.out.println(y + " x " + x + " = " + x*y);
//		}
//		
//		
//		

		
		
		int x1 = 3;
		int y1 = 3;
		int z1 = 3;
		
		
			System.out.println(x1);
			System.out.println(y1);
			System.out.println(z1);
			
				double x [] = {3, 5, 3, 5};
				
					for (int aux = 0; aux < x.length; aux++) {
						System.out.println("Valor do indice " + aux + " = " + x[aux]);
						
				}
						String nome[] = { "Rafael", "Gislene", "Lara"};
						
					for (int aux1 = 0; aux1 < nome.length; aux1++) {
						System.out.println(nome[aux1]);
						 if (nome[aux1] == "Gislene") {
							 System.out.println("O indice de Gislene � = " + aux1);
						 }
					}	
					
					
					int[] arrayInt = new int[5];
					String[] ArrayString = new String[4];
					double[] ArrayDouble = new double[3];
					
					 arrayInt[3] = 4;
					 
					int[] numero = new int[6];
					Scanner teclado = new Scanner(System.in);
					
					
					for (int aux2 = 0; aux2 < numero.length; aux2 ++) {
						System.out.println("Digite um n�mero qualquer");
						 numero[aux2] = teclado.nextInt();
						 
					}
					
					for (int aux2 = 0; aux2 < numero.length; aux2 ++) {
						System.out.println("Indice " + aux2 + " = " + numero[aux2]);
						 numero[aux2] = teclado.nextInt();
						 
					}
		
			
		}	
			

		
	}




