package Fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HumansVSPandas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Personagens vilao1 = new Viloes("Panda bebe", 20, 5, Raca.PANDA);
		
		
		Scanner entrada = new Scanner(System.in);
		
		Personagens heroi1 = new Herois("Jacke", 150, 25, Raca.HUMANO, "Arqueiro");
		Personagens heroi2 = new Herois("Annabeth", 200, 20, Raca.HUMANO, "Guerreira");
		
			List<Personagens> listaDeHerois = new ArrayList<Personagens>();
			 
			listaDeHerois.add(heroi1);
			listaDeHerois.add(heroi2);
		
		
		System.out.println("Bem-vindo ao HvsP");
		System.out.println("Escolha seu heroi(");
		System.out.println();
		System.out.println("Digite 1 para selecionar Jack e 2 para selecionar Annabeth");
		System.out.println();
		System.out.println("PERSONAGENS:");
		
		System.out.println(listaDeHerois);
		 int selecao = entrada.nextInt();
		
		while(vilao1.vida>0) { 
		 
		if(selecao==1) { //IF 1
			
			System.out.println("Fase 1");
			System.out.println("Comandos: 1-Atacar 2-Defesa");
			System.out.println();
			System.out.println("Panda bebe apareceu, derrote-o!");
			System.out.println();
			System.out.println("defesa ou ataque?");
			 int acao= entrada.nextInt();
			  
			 if (acao==1) {
				 heroi1.atacar(heroi1.forca, vilao1);
				 
				 System.out.println("Fim de jogo, voce venceu!");
				 System.out.println("Status do personagem: ");
				 
				 System.out.println(heroi1);
				 
			 } else if (acao==2) {
				 System.out.println("defesa realizada");
			 } else {
				 System.out.println("Encerrando programa...");
			 }
			
			
			 
		
			 		 
			 } else if (selecao==2 ) { //IF 1
				 
				 System.out.println("Fase 1");
					System.out.println("Comandos: 1-Atacar 2-Defesa");
					System.out.println();
					System.out.println("Panda bebe apareceu, derrote-o!");
					System.out.println();
					System.out.println("defesa ou ataque?");
					 int acao= entrada.nextInt();
					  
					 if (acao==1) {
						 heroi2.atacar(heroi2.forca, vilao1);
						 
						 System.out.println("Fim de jogo, voce venceu!");
						 System.out.println("Status do personagem: ");
						 System.out.println();
						 System.out.println(heroi2);
						 
					 } else if (acao==2) {
						 System.out.println("defesa realizada");
					 } else {
						 System.out.println("Encerrando programa...");
					 }
					
					
			 }
		
		 
		 
		 
		}//Fim enquanto	
		
		
		
		
		
		
		 
	}

}
