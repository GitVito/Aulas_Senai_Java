
public class Endereco {
	
	private String rua;
	private String bairro;
	private int num;
	
	//Métodos Get and Set//
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	//Fim dos métodos Get and Set//
	
	
	
	
	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", bairro=" + bairro + ", num=" + num + "]";
	}
	
	public Endereco(String[] arrayAuxiliar0) { 		
	
	String[] arrayAuxiliar1 = arrayAuxiliar0[2].split("=");
	this.rua = arrayAuxiliar1[1].trim();
	
	String[] arrayAuxiliar2 = arrayAuxiliar0[3].split("=");
	this.bairro = arrayAuxiliar2[1].trim();
	
	String[] arrayAuxiliar3 = arrayAuxiliar0[4].split("=");
	this.num = Integer.parseInt(arrayAuxiliar3[1].trim()); //O trim não recebe nada dentro do parentese
	
			
	}
	public Endereco() {
		// TODO Auto-generated constructor stub
	}
	
	
}
