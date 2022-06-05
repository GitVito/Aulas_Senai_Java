import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		List<Pessoa> listaPessoa = new ArrayList<Pessoa>();
		Scanner entrada = new Scanner(System.in);

		for (int x = 0; x < 4; x++) {

			Pessoa pessoa = new Pessoa(); //Fica dentro do for, pois irá criar um objeto para cada sequência de informações, se ficar do lado de fora, as informações irão ser gravadas em um objeto só
			pessoa.setEndereco(new Endereco()) ;

			System.out.println("Digite seu nome:");
			pessoa.nome = entrada.next();

			System.out.println("Digite sua idade:");
			pessoa.idade = entrada.nextInt();

			System.out.println("Digite seu Bairro:");
			pessoa . getEndereco (). setBairro ( entrada . próximo ()); //Com o método get pegamos o determinado atributo, e com o set, alteramos esse atributo

			Sistema . fora . println ( "Digite o nome da sua rua:");
			pessoa.getEndereco().setRua(entrada.next());

			System.out.println("Digite o numero da sua residencia:");
			pessoa.getEndereco().setNum(entrada.nextInt());

			System.out.println("Digite 1, caso você seja do sexo Masculino, e 2 se for do sexo Feminino");

			
			int pe = 0;
	
			
			while (pe != 1 && pe != 2) //enquanto a pessoa digitar um valor diferente de 1 e 2, o conteudo dentro do while sera reproduzido.
				
				pe = entrada.nextInt(); //a variavel vai receber o valor que a pessoa digitar quando estiver realizando o cadastro				
			if (pe == 1) {

				Sexo  sexo  = Sexo . MASCULINO ; //criamos uma variavel do tipo Sexo, que foi o Enum que criamos anteriormente, fazemos esta variavel receber o valor mas cr masculino 
				pessoa . setSexo ( sexo ); //com o metodo set, altramos o atributo de pessoa e acrescentamos o sexo masculino. Isso tudo se a pessoa tiver digitado 1,  se ela tiver digitado 2, sera o mesmo processo, contudo em vez de masculino, sera feminino.
			} senão   if ( pe   ==   2 ) {
				Sexo sexo = Sexo.FEMININO;
				pessoa.setSexo(sexo);
			} else { // se a pessoa digitar um numero diferente de 1 e 2, nao sera aceito
				Sistema . fora . println ( "Você digitou um número de opções, tente novamente");
			}

			} 	
			
			listaPessoa.add(pessoa); //ira adicionar todas as informacoes dentro da lista

		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("InformacoesDeCadastro.txt"))) {

			for (Pessoa p : listaPessoa) {

				escrever.write(p.toString());

			} // Fechamento do for

		} // Fechamento do try / Usado para criar o arquivo .txt

		
		
		List<Pessoa> listInfoLido = new ArrayList<Pessoa>();
		
		try (BufferedReader print = new BufferedReader(new FileReader("InformacoesDeCadastro.txt"))) {

		
			String line;
			String recebe = " ";
			
			
			
			

			while ((line = print.readLine()) != null) {
				
				Pessoa pessoas = new Pessoa(line);
				
				listInfoLido.add(pessoas);
			}
			
			for (Pessoa usuLido : listInfoLido) {
				
				System.out.println(usuLido.toString());
			}
			
			
		} // Fechamento do try, usado para a leitura do arquivo .txt

		
		
		
		
	}
}
