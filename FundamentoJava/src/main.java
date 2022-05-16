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
//		a= (int) y; //Casting Explícito, Você dizer para o eclipseque assume a responsabilidade por perder informação.
//		b= x; //Casting(escalação) implícito, consegur passar o conteudo de uma variável para outra sem perder nenhum dado.
//		//Aqui você não perderá informação,
//		
//		System.out.println(z);
//		System.out.println(b);
//		System.out.println(a);
		
//		int idadepessoa = 60;
//		
//		if (idadepessoa < 18) {
//			
//		System.out.println("Você não pode beber");
//		}
//			
//		
//		else if(idadepessoa < 60) { //Pode fazer quantas condições quiser
//			System.out.println("Bora tomar uma!");
//		}
//		else {
//			System.out.println("Quanto é a aposentadoria?");
//		}
//		
//		System.out.println("Você tem " + idadepessoa + " anos");
//		
		
//		int num = 8;
//		
//		switch (num) {
//			
//		case 1:
//			System.out.println("Domingo"); //O break é aquele que vai barrar 
//			break;
//		case 2:
//			System.out.println("Segunda-feira");
//			break;
//		case 3:
//			System.out.println("Terça-feira");
//			break;
//		case 4:
//			System.out.println("Quarta-feira");
//			break;
//		case 5:
//			System.out.println("Quinta-feira");	
//			break;
//		default:		 //Funciona como um else, caso nenhum dos casos for encontrados
//			System.out.println("Esse número não representa um dia da semana.");
//		}
		
		
//		char caractere = 'a';		//String é um conjunto de caractere //Caso você coloque outro valor além do declarado para variável, vai dar erro.
//		
//		switch (caractere) {
//			case 'a':
//				System.out.println("Seu caractere é a ");
//				break;
//			case 'b':
//				System.out.println("Seu caractere é b ");
//				break;
//			default:
//			System.out.println("Valor inválido");
//		
//		
//		}
		
//		String farol = "verde";
//		
//		 switch (farol) { //switch é o ESCOLHA CASO
//		 
//		 case "verde":
//			 System.out.println("ACELERA");
//			 break;
//		 case "amarelo":
//			 System.out.println("Calma e atenção");
//			 break;
//		 case "vermelho":
//			 System.out.println("Pare!");	 
//			 break;
//		default:
//			System.out.println("Valor inválido!");
//		 
//		 }
		
		
//		int x=0;
//		while(x<10) { //Tudo que retornar verdadeiro ou falso é possível ser colocado / //While é o ENQUANTO
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
		 
		 
		
		
		
//		for(int x=0; x<10; x++) { // se você criar a variável aqui dentro, ela só existe aqui dentro
//			System.out.println(x); //""Conte de 0 a 10""
//		}
		// x++ Significa: "Pega o valor que está aqui dentro, adiciona 1" | "se quiser adicionar mais é x+=2" funciona também com * (multiplicar)
		// | 1= valor da variável | 2= valor condicional | 3= incremento|
		
		
		//--___----___Tabuada--___----___\\
//		
//		Scanner a = new Scanner(System.in);
//		
//		System.out.println("Digte o número da tabuada que você deseja:");
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
							 System.out.println("O indice de Gislene é = " + aux1);
						 }
					}	
					
					
					int[] arrayInt = new int[5];
					String[] ArrayString = new String[4];
					double[] ArrayDouble = new double[3];
					
					 arrayInt[3] = 4;
					 
					int[] numero = new int[6];
					Scanner teclado = new Scanner(System.in);
					
					
					for (int aux2 = 0; aux2 < numero.length; aux2 ++) {
						System.out.println("Digite um número qualquer");
						 numero[aux2] = teclado.nextInt();
						 
					}
					
					for (int aux2 = 0; aux2 < numero.length; aux2 ++) {
						System.out.println("Indice " + aux2 + " = " + numero[aux2]);
						 numero[aux2] = teclado.nextInt();
						 
					}
		
			
		}	
			

		
	}




