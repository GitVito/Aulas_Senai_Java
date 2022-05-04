
public class Carro extends Veiculo{
	
	private boolean quatroPorta;
	
	
	
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir(); //O super chama uma parte do código que tem na Super classe, e só incrementa as novas informações
		
		 System.out.println("Tem quatro portas: " + quatroPorta);
	}
	
	

	public boolean isQuatroPorta() {
		return quatroPorta;
	}

	public void setQuatroPorta(boolean quatroPorta) {
		this.quatroPorta = quatroPorta;
	}
	
	

}
