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

			Pessoa pessoa = new Pessoa(); //Fica dentro do for, pois ir� criar um objeto para cada sequ�ncia de informa��es, se ficar do lado de fora, as informa��es ir�o ser gravadas em um objeto s�
			pessoa.setEndereco(new Endereco()) ;

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

			System.out.println("Digite 1, caso voc� seja do sexo Masculino, e 2 se for do sexo Feminino");

			
			int pe = 0;
	
			
			while (pe != 1 && pe != 2) {
				
				pe = entrada.nextInt();
				
			if (pe == 1) {

				Sexo sexo = Sexo.MASCULINO;
				pessoa.setSexo(sexo);
			} else if (pe == 2) {
				Sexo sexo = Sexo.FEMININO;
				pessoa.setSexo(sexo);
			} else {
				System.out.println("Voc� digitou um n�mero fora das op��es, tente novamente");
			}

			} 	
			
			listaPessoa.add(pessoa);

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
