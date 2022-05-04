
public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
	
		animal.falar();
		
		 animal = new Gato();
		 animal.falar(); // A forma anterior era uma, e agora é outra, isso é polimorfismo
		
		
	}

}
