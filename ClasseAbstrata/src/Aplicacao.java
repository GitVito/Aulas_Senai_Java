
public class Aplicacao {

	public static void main(String[] args) {
		
		//Item item = new Item();
		
		Item item = new Moeda(); //Quando voc� cria a vari�vel, n�o � nescess�rio criar novamente com o "Item item", apenas coloque a vari�vel e conecte com o m�todo
			item.pegar();
			
			item = new Cogumelo();
			item.pegar();
			
			item = new Diamante();
			item.pegar();
		

	}

	
	
}
