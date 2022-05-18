import java.util.ArrayList;
import java.util.List; // Queremos usar uma classe do java, para utilizar precisamos importar

public class Main {

	
	
	public static void main(String[] args) {
		
		 List lista = new ArrayList(); //Para usar classes que não estão na pasta junto ao seu código principal, você precisa usar o import   //Tomar cuidado de onde está vindo a classe//

		 
		 	lista.add("abc");   //Agora você pode acessar todos os metdos que estão atrelados à lista
		 	lista.add(12);
		 	lista.add(true);
		 	
		 	
		 	for (int x=0; x < lista.size(); x++) { //Aqui você intera enquanto for verdadeiro, pois no outro modo não possui comparação.
		 		
		 		System.out.println(lista.get(x));	
		 		
		 		
		 	}
		 	
		 	
		 	System.out.println(); //Espaço
		 	
		 	
		 	for (Object valor : lista) { // Aqui você intera sobre toda a sua lista
		 		
		 		System.out.println(valor);
		 	}
		 	

		 	System.out.println(); //Espaço
		 	
		 		
		 	lista.remove(0); //Remove uma posição da lista (posição determinada dentro do parentese)
		 	
		 	for (Object valor : lista) {
		 		
		 		System.out.println(valor);
		 	}
		 	

		 	System.out.println(); //Espaço
		 	
		 	
		 	lista.add(0, "def");
		 	
		 	for (Object valor : lista) {
		 		
		 		System.out.println(valor);
		 	}
		 	

		 	System.out.println(); //Espaço
		 	
		 	
		 	lista.add(0, "set"); //atualiza a posição, substitue o valor
		 	
		 	for (Object valor : lista) {
		 		
		 		System.out.println(valor);
		 	}	
		 	
		 	

		 	System.out.println(); //Espaço
		 	
		 	
		 	lista.clear();
		 	
		 		if(lista.isEmpty()) {  //Se a lista estiver vazia, este "isEmpty", tem valor booleano,         
		 		System.out.println("Sua lista está vazia");
		 	}		else { 
		 				System.out.println("Sua lista não está vazia");
		 	}
		 	
		 	
		 	
		 	Conta conta1 = new Conta("Agua", 60.00);
		 	Conta conta2 = new Conta("Luz", 120.00);
		 	
		 	
		 	List<Conta> listaDeContas = new ArrayList<Conta>(); //Diz o tipo da lista, e faz com que somente os objetos criados da classe Conta entrem nessa lista
		 	
		 	//Você pode usar uma super classe Animal, para fazer uma classe animal, e então colocar Cachorro, Gato, etc..,
		 	
		 	listaDeContas.add(conta1);
		 	listaDeContas.add(conta2);
		 	
		 	
		 	
		 	
	}
	

}
