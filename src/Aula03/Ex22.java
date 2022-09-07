package Aula03;

import java.util.Scanner;

public class Ex22 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		int opt;
		
		float v1, v2, v3;
		
		for(;;) {
			
			do {
				System.out.printf("Calculadora de area\n\n"
						+ "Menu principal:\n"
						+ "[1] - Triangulo\n"
						+ "[2] - Quadrado\n"
						+ "[3] - Retangulo\n"
						+ "[4] - Circulo\n"
						+ "[5] - Encerrar\n"
						+ "Opcao selecionada: ");
				opt = ler.nextInt();
				
				if(opt > 5 || opt < 1)
					System.out.printf("\n### Opcao invalida. ###\n");
				
			}while(opt > 5 || opt < 1);
			
			switch(opt) {
				case 1:
					System.out.printf("Informe a altura do triangulo: ");
					v1 = ler.nextFloat();
					
					System.out.printf("Informe o tamanho da base do triangulo: ");
					v2 = ler.nextFloat();
					
					System.out.printf("A area do triangulo e %.2f m2", ((v1 * v2) / 2));
					break;
				case 2:
					System.out.printf("Informe o tamanho de um dos lados do quadrado: ");
					v1 = ler.nextFloat();
					
					System.out.printf("A area do quadrado e %.2f m2", v1 * v1 );
					break;
				case 3:
					System.out.printf("Informe a altura do retangulo: ");
					v1 = ler.nextFloat();
					
					System.out.printf("Informe o tamanho da base do retangulo: ");
					v2 = ler.nextFloat();
					
					System.out.printf("A area do retangulo e %.2f m2", v1 * v2 );
					break;
				case 4:
					System.out.printf("Informe o tamanho do raio do circulo: ");
					v1 = ler.nextFloat();
					
					System.out.printf("A area do circulo e %.2f m2", (3.14159 * (v1 * v1)) );
					break;
			}
			System.out.printf("\n");
			
			if(opt == 5)
				break;
			
		}
	}
}
