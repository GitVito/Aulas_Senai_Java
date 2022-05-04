
public class Aplicacao {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		
		 	 veiculo.setMarca("PedrosNave");
		 	 veiculo.setModelo("Nav");
		 	 veiculo.setAno(2045);
		 	 
		 	 	veiculo.imprimir();
		 	 	veiculo.buzinar();

		 	 
		 System.out.println();	 	
		 	 	
		 	 	
		Carro carro = new Carro();
		 carro.setMarca("Fiat");
		 carro.setModelo("Uno");
		 carro.setAno(2015);
		 carro.setQuatroPorta(true);
		 
		 carro.imprimir();
		 carro.buzinar();
		 
		
		 System.out.println();
		
		
		Caminhao caminhao = new Caminhao();
		 caminhao.setMarca("PredosNave");
		 caminhao.setModelo("5");
		 caminhao.setAno(2090);
		 
		 caminhao.imprimir();
		 caminhao.buzinar();
		 
		 System.out.println();
		 
		 
		 Moto moto = new Moto();
		 moto.setMarca("PredosNave");
		 moto.setModelo("XR100");
		 moto.setAno(2021);
		 
		 moto.imprimir();
		 moto.buzinar();
		  
		 
		 
		 
	}

}
