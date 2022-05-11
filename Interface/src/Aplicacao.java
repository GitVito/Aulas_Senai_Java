
public class Aplicacao {

	public static void main(String[] args) {
		
		Rota rota = new Rota();
//		
		Ferrari ferrari = new Ferrari();
//		Fusca fusca = new Fusca();
//		
//			rota.ir(ferrari); //Ela pede um automovel, então instancie a Ferrari
//			rota.ir(fusca); //Usando o polimorfismo
		
//			Automovel ferrari = new Ferrari();
//			  rota.ir(ferrari);
//			Automovel fusca = new Fusca();
//			  rota.ir(fusca);
//			
			 
			  Vendedor vendedor = new Vendedor();
			  Apartamento apartamento = new Apartamento();
			  
			  	vendedor.mostrarPreco(apartamento);
			  	vendedor.mostrarPreco(ferrari);
	
	}

}
