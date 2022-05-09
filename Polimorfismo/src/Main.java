
public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Cachorro();
	
		animal.falar();
		
		 animal = new Gato();
		 animal.falar(); // A forma anterior era uma, e agora é outra, isso é polimorfismo
		
		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();
		 falar(gato);
		 falar(cachorro);
	}
	
	public static void falar(Animal a) {
		a.falar();
		
		 if(a instanceof Cachorro) {
			 Cachorro c = (Cachorro) a;
			  c.Morder();
		 }
	}
	
	
	
	
	
	

}
