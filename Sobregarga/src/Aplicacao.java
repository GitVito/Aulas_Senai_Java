import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		Matematica matematica = new Matematica();
		
		
		System.out.println("Somar dois n�meros");
		
		System.out.println("Digite o primeiro n�mero: " );
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int y = scanner.nextInt();
		
		
		int soma = matematica.somar(x, y);
		System.out.println("Resultado: "+ soma + "!!!");
		
		
		soma = matematica.somar(x, y, 5);
		System.out.println("Resultado: "+ soma + "!!!");
		
		
		double soma2 = matematica.somar(x, y);
		System.out.println("Resultado: "+ soma2 + "!!!");
		
		
	}

}
