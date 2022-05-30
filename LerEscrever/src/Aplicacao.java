import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	
		List<Sabonetee> lista = new ArrayList<Sabonetee>();
		
			Sabonetee sabonete0 = new Sabonetee("Lavanda", "Branco"); //Criação do objeto para ser acrescentado à lista
			 lista.add(sabonete0); //Adicionando o objeto na lista, com o "add" na lista 
			 
			Sabonetee sabonete1 = new Sabonetee("Floresta", "Verde");
			 lista.add(sabonete1); 
			 
			Sabonetee sabonete2 = new Sabonetee("Tapioca", "Amarelo");
			 lista.add(sabonete2);	 
	
	
	try(BufferedWriter escrever = new BufferedWriter(new FileWriter ("Sabonetes.txt"))) {
		
		for (Sabonetee sabao : lista) {
			escrever.write(sabao.toString()); 
		}
	} //Fim da escrita
	
	
		
	
	try(BufferedReader reader = new BufferedReader (new FileReader ("Sabonetes.txt"))) {
		
		String line;
		String string = "";
		
		List<Sabonetee> listSabaoLido = new ArrayList<Sabonetee>();
	 	 listSabaoLido.add(sabonete0);
		 listSabaoLido.add(sabonete1);
		 listSabaoLido.add(sabonete2);
		
		while((line = reader.readLine())!= null) { //readLine usado para ler um arquivo de texto
			string += line + "\n";
		}
		
		
		
			
		
		
		System.out.println(listSabaoLido);
	}
	
	
		
	
	
	}

}
