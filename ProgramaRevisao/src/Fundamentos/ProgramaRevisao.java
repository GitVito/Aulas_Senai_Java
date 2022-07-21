package Fundamentos;

import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		Funcionarios func1 = new Funcionarios();
		Funcionarios func2 = new Funcionarios();
	
		//Cadastrar funcionarios
		
		
		
		System.out.println("Cadastramento de funcionarios");
		System.out.println();
		
		
		System.out.println("Digite o nome do funcionario");
		func1.setNome(entrada.next());
		
		System.out.println("Digite o cpf do funcionario");
		func1.setCpf(entrada.nextInt());
		
		System.out.println("Digite o salario do funcionario");
		func1.setSalario(entrada.nextInt());
		
			System.out.println("Cadastro realizado, deseja ir para o segundo cadastramento?");
			System.out.println("Digite 1 para SIM e 2 NAO");
			int x = entrada.nextInt();
		
		
		if (x==1) {
			
			System.out.println("Cadastramento do segundo funcionario");
			System.out.println();
			
			
			System.out.println("Digite o nome do funcionario");
			func2.setNome(entrada.next());
			
			System.out.println("Digite o cpf do funcionario");
			func2.setCpf(entrada.nextInt());
			
			System.out.println("Digite o salario do funcionario");
			func2.setSalario(entrada.nextInt());	
			
			//-------//
			
			
			System.out.println("Cadastros efetuados: ");
			System.out.println();
			
			
			System.out.println(func1);
			
			
			System.out.println(func2);
			
			System.out.println();
			System.out.println("Comparacao de salario entre funcionarios: ");
			
			double salario1 = func1.getSalario();
			double salario2 = func2.getSalario();
			
			double diferenca = salario1-salario2;
			
			
			System.out.println("A diferenca entre os salarios sao: " + diferenca);
			
			
		} else if (x > 2) {
		
			System.out.println("Encerrando o programa...");
		} 
		
		
		
		
		
		
	
	}

}
