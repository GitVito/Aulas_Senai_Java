import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Endereco {
	
	int num;
	String rua;
	String bairro;
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
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
	
	
	@Override
	public String toString() {
		return " [num=" + num + ", rua=" + rua + ", bairro=" + bairro + "]";
	}

	
	
	
}
