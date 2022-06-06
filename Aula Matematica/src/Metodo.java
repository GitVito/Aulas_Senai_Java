import java.util.Scanner;

public class Metodo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		CalculoArea calculoarea = new CalculoArea();
		
		System.out.println("Vamos calculuar seu quadrado!");
		
		System.out.println("Digite os atrbutos de seu quadrado: ");
		System.out.println("Largura: "); int x = scanner.nextInt(); //A variável x receberá o valor inteiro, que o usuário digitar, o mesmo para o y
		System.out.println("Altura: "); int y = scanner.nextInt();
		
		
		
		
		System.out.println("Vamos calculuar seu triângulo!"); //Usando o syso para mostrar palavras ou frases qye fizemos para auxiliar no nosso programa
		
		System.out.println("Digite os atrbutos de seu triângulo: ");
		System.out.println("Largura: "); double a = scanner.nextDouble();
		System.out.println("Largura: "); double b = scanner.nextDouble();
		
		
		System.out.println("Vamos calculuar seu retângulo!");
		
		System.out.println("Digite os atrbutos de seu retângulo: ");
		System.out.println("Largura: "); int d = scanner.nextInt();
		System.out.println("Largura: "); int e = scanner.nextInt();
		
		
		
		System.out.println("Área do quadrado: ");
		
		
		
	}

}
