
public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
	
		animal.falar();
		
		 animal = new Gato();
		 animal.falar(); // A forma anterior era uma, e agora � outra, isso � polimorfismo
		
		
	}

}
