import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
											//throws - � ele quem vai fazer com que tratar "Exce��o de entrada e sa�da (IOException)"
	public static void main(String[] args) throws IOException { //Tenho que tratar o erro e mostrar ao usuario, contudo isso ir� apenas mostrar em uma mensagem aqui
		// TODO Auto-generated method stub

		
		
			List<Sabonete> lista = new ArrayList<Sabonete>();
			 
			 Sabonete sabonete0 = new Sabonete("Lavanda", "Branco");
			  lista.add(sabonete0);
			 
			 Sabonete sabonete1 = new Sabonete("Floresta", "Verde");
			 lista.add(sabonete1);
			 
			 Sabonete sabonete2 = new Sabonete("Tapioca", "Amarelo");
			 lista.add(sabonete2);
			
			
			
//		
//		String s = "Texto para ser gravado no arquivo"; //Vari�vel de modelo
		
		
				
		
			try(BufferedWriter escrever =  new BufferedWriter(new FileWriter ("Saida.txt"))) { //Precisa receber outro objeto
				
				for (Sabonete sabao : lista) { //O for � dentro do try, pois ao colocar dentro, ele escrever� 3 vezes da forma correta(um embaixo do outro), isso acontece porque caso voc� colocar fora o try ir� subescrever e mostrar� no final apenas a �ltima linha que aparecer�. O for come�a da linha 0, e o try atr�s dele far� com que ele subscreva a linha 0 2 vezes depois da primeira  
					
					
				//Pode escrever em diversos lugares, que voc� ir� determinar nos par�metros
				//Criamos um objeto para escrever
				
				//O processo pode ocorrer algum erro, desde a leitura ao gravamento, por isso ele considera errado
				
				escrever.write(sabao.toString());  //Voc� s� pode pular a linha direto no texto do arquivo, que voc� est� escrevendo com o /n
			
			}
			
		}
				
				
				
					
			
		}

}
