import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException { //Tenho que tratar o erro e mostrar ao usuario, contudo isso ir� apenas mostrar em uma mensagem aqui
		// TODO Auto-generated method stub

		
		String s = "Texto para ser gravado no arquivo"; //Varia�vel de modelo
		
			try(BufferedWriter escrever =  new BufferedWriter(new FileWriter("Saida.txt"))) { //Precisa receber outro objeto
				//Pode escrever em diversos lugares, que voc� ir� determinar nos par�metros
				//Criamos um objeto para escrever
				escrever.write(s);  //O processo pode ocorrer algum erro, desde a leitura ao gravamento, por isso ele considera errado
			
			
			}
				
				
				
				
			
		}

}
