
public class Ferrari implements Automovel, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Vire a esquerda");
		
	}

	@Override
	public void virarDireita() {
		System.out.println("Vire a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelere");
		
	} //Se queremos implementar as regras de um autom�vel, a palavra � "Implements"

	
	
	@Override
	public double getPreco() {
		
		return 1000000;
	}

	
	
}
