
public class Veiculo {
	
	private String some;
	protected String marca; // Quando você cria um objeto ele virá sem nada, pois você não colocou nenhum valor as variaveis
	protected String modelo;
	protected int ano;
	
	public void buzinar() { //1- Modificador de acesso / 2- Retorno/ 3- nome e parametro
		System.out.println("BI Bi");
		
	}
	
	public void imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
	
	
	public String getSome() {
		return some;
	}
	public void setSome(String some) {
		this.some = some;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	
	
	
	
	

}
