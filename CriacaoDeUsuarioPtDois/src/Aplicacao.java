import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 
		 List lista = new ArrayList();
		 Scanner entrada = new Scanner(System.in);
		 Pessoa pessoa = new Pessoa();
		 
		 pessoa.setEndereco(new Endereco());
		 
		 
		 for (int x = 0; x<1; x++  ) {
			 
			 
			 	
		 		System.out.println("Digite seu nome:");
		 		 pessoa.nome = entrada.next(); 
		 		 
		 		System.out.println("Digite sua idade:");
		 		pessoa.idade = entrada.nextInt();	 
		 		 
		 		System.out.println("Digite seu Bairro:");
		 		pessoa.getEndereco().setBairro(entrada.next());
		 		 
		 		System.out.println("Digite o nome da sua rua:");
		 		pessoa.getEndereco().setRua(entrada.next());
		 		
		 		System.out.println("Digite o numero da sua residencia:");
		 		pessoa.getEndereco().setNum(entrada.nextInt());
		 		
		 		
		 		System.out.println("Digite 1, caso você seja do sexo Masculino, e 2 se for do sexo Feminino");
		 		
		 		
		 		
		 		int pe = entrada.nextInt();	
		 		
		 		if (pe == 1) {
		 				
		 		
		 			Sexo sexo = Sexo.MASCULINO; 
		 				pessoa.setSexo(sexo);
		 			} else {
		 				Sexo sexo = Sexo.FEMININO;
		 				pessoa.setSexo(sexo);
		 			}
		 			
		 			lista.add(pessoa);
		 			
			 
		 }
		 

		 for (Object valor : lista) {
		 		System.out.println(pessoa);
		 	}
		 
	
		 
		 
	}	 
}
