
public class Preparador { //Classe de passagem = cria metodos iguais, e entrega o retorno/ Preparador=Receita que o barman irá usar
	
	public void prepararBebida(Bebida bebida){
		System.out.println("Preparando bebida" + bebida.getNome());
		
			bebida.preparar();
		
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
			
		}
		 System.out.println("Bebida preparado com sucesso!!");
	}

	
	
	
	
} //Fechamento geral
