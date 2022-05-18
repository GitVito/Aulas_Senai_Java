import java.util.ArrayList;
import java.util.List; // Queremos usar uma classe do java, para utilizar precisamos importar

public class Main {

	
	
	public static void main(String[] args) {
		
		 List lista = new ArrayList(); //Para usar classes que n�o est�o na pasta junto ao seu c�digo principal, voc� precisa usar o import   //Tomar cuidado de onde est� vindo a classe//

		 
		 	lista.add("abc");   //Agora voc� pode acessar todos os metdos que est�o atrelados � lista
		 	lista.add(12);
		 	lista.add(true);
		 	
		 	
		 	for (int x=0; x < lista.size(); x++) { //Aqui voc� intera enquanto for verdadeiro, pois no outro modo n�o possui compara��o.
		 		
		 		System.out.println(lista.get(x));	
		 		
		 		
		 	}
		 	
		 	
		 	System.out.println(); //Espa�o
		 	
		 	
		 	for (Object valor : lista) { // Aqui voc� intera sobre toda a sua lista
		 		
		 		System.out.println(valor);
		 	}
		 	

		 	System.out.println(); //Espa�o
		 	
		 		
		 	lista.remove(0); //Remove uma posi��o da lista (posi��o determinada dentro do parentese)
		 	
		 	for (Object valor : lista) {
		 		
		 		System.out.println(valor);
		 	}
		 	

		 	System.out.println(); //Espa�o
		 	
		 	
		 	lista.add(0, "def");
		 	
		 	for (Object valor : lista) {
		 		
		 		System.out.println(valor);
		 	}
		 	

		 	System.out.println(); //Espa�o
		 	
		 	
		 	lista.add(0, "set"); //atualiza a posi��o, substitue o valor
		 	
		 	for (Object valor : lista) {
		 		
		 		System.out.println(valor);
		 	}	
		 	
		 	

		 	System.out.println(); //Espa�o
		 	
		 	
		 	lista.clear();
		 	
		 		if(lista.isEmpty()) {  //Se a lista estiver vazia, este "isEmpty", tem valor booleano,         
		 		System.out.println("Sua lista est� vazia");
		 	}		else { 
		 				System.out.println("Sua lista n�o est� vazia");
		 	}
		 	
		 	
		 	
		 	Conta conta1 = new Conta("Agua", 60.00);
		 	Conta conta2 = new Conta("Luz", 120.00);
		 	
		 	
		 	List<Conta> listaDeContas = new ArrayList<Conta>(); //Diz o tipo da lista, e faz com que somente os objetos criados da classe Conta entrem nessa lista
		 	
		 	//Voc� pode usar uma super classe Animal, para fazer uma classe animal, e ent�o colocar Cachorro, Gato, etc..,
		 	
		 	listaDeContas.add(conta1);
		 	listaDeContas.add(conta2);
		 	
		 	
		 	
		 	
	}
	

}
