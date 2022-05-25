import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		
		
		String rece = "";  
		
			
		
		
		 try(BufferedWriter escrever =  new BufferedWriter(new FileWriter ("tave.txt"))) {


				System.out.println("Digite algo:");
				 rece = entrada.nextLine();
		
	  
			 escrever.write(rece);
		 }
	
	
	
		 try(BufferedReader reader = new BufferedReader (new FileReader("tave.txt"))){
				String line;
				String string = "";
				
				  while((line = reader.readLine())!= null) {
					  string += line + "\n";
				  }
				  System.out.println(string);
				
			}

	
	
	
	
	
	
	
	}

}
