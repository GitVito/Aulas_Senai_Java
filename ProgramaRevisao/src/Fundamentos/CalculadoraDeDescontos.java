package Fundamentos;

import java.util.Scanner;

public class CalculadoraDeDescontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner entrada = new Scanner(System.in);
		Produtos prod = new Produtos();
		
		
		System.out.println("Bem-vindo a Calculadora de Descontos");
		
		
		System.out.println("Digite o nome do produto: ");
		 prod.setNome(entrada.next());
		 
		 System.out.println("Digite o valor do produto: ");
		 prod.setValor(entrada.nextInt());
		 
		 System.out.println("Digite o desconto que sera aplicado ao produto: ");
		 prod.setDesconto(entrada.nextInt());

		 
		 
		 System.out.println("Produto final com desconto de " + prod.getDesconto() + "% aplicado");
		 System.out.println();
		 
		 prod.calcularDesconto();
		 
		 System.out.println(prod);
	}

}
