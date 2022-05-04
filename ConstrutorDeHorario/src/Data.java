
public class Data {
	public static final int FORMATO_12H = 1;
	public static final int FORMATO_24H = 2;
	
	private int dia;
	private int mes;
	private int ano;
	private int hora;
	private int minuto;
	private int segundo;
	
	//Construtor que recebe dia, mes e ano
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	//Construtor completo, que recebe informa��es de data e hor�rio
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) {
		//Chama o outro construtor da Classe
		this (dia, mes, ano);
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
		
	}
	
	//Imprime a data/hora (de acordo com o formato especificado)
	public void imprimir(int formato) {
		//Monta a string de impress�o de data
		
		String data = dia + "/" + mes + "/" + ano;
		 
		 if (hora == -1) {
			 //Se a hora for -1, significa que os dados de hor�rio n�o foram passado no construtor.
			 //Ent�o exibe s� a data
			 System.out.println(data);
			 
		 } else {
			 //Monta parte da string da horario (deixa a hora de for por enquanto)
			  String horario = ":" + minuto + ":" + segundo;
			  
			  if (formato == FORMATO_24H) {
				  //Se o formato for 24h, concatena a hora no inicio da String (o atributo j� foi 
				   //Se o formato 12h
				   if (hora == 0) {
					   horario = 12 + horario;
					   horario += " AM";
					   
				   } else if (hora >= 12) {
					   //Se a hora for maior ou igual a 12, � preciso subtrair 12 da hora para obter
					    //a hora no formato 12h, e concatena o "PM" no fim
					     horario = (hora - 12) + horario;
					     horario += " PM";
				   } else {
					   //Se a hora for menor que 12, simplesmente utiliza a pr�pria hora e concatena
					    //o "AM" no fim
					   horario = hora + horario;
					   horario += " AM";
					   
					   
					   }
				  
			  }
		 
		 //Imprime a data/hora formatada
			  System.out.println(data + " " + horario);
			  	
			  
		 
		 }
	
	}


	
	
	//M�todos getters
	
	
	
	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	public int getSegundo() {
		return segundo;
	}


	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}

	

	
	
}
