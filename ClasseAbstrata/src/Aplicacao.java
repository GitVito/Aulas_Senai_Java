
public class Aplicacao {

	public static void main(String[] args) {
		
		//Item item = new Item();
		
		Item item = new Moeda(); //Quando você cria a variável, não é nescessário criar novamente com o "Item item", apenas coloque a variável e conecte com o método
			item.pegar();
			
			item = new Cogumelo();
			item.pegar();
			
			item = new Diamante();
			item.pegar();
		

	}

	
	
}
