package Aula03;

import java.util.Scanner;

public class Ex21 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int opt;
		float v1, v2;
		
		for(;;) {
			System.out.printf("Digite um valor qualquer: ");
			v1 = ler.nextFloat();
			
			System.out.printf("Digite outro valor qualquer: ");
			v2 = ler.nextFloat();
			
			System.out.printf("\n"
					+ "Menu principal: \n"
					+ "[1] - Multiplicacao.\n"
					+ "[2] - Adicao.\n"
					+ "[3] - Divisao.\n"
					+ "[4] - Subtracao.\n"
					+ "[5] - Encerrar programa.\n"
					+ "Opcao selecionada: ");
			
			opt = ler.nextInt();
			
			if(opt == 5)
				break;
			
			switch(opt) {
				case 1:
					System.out.printf("%.2f X %.2f = %.2f", v1, v2, (v1 * v2) );
					break;
				case 2:
					System.out.printf("%.2f + %.2f = %.2f", v1, v2, (v1 + v2) );
					break;
				case 3:
					if(v2 == 0) {
						System.out.printf("Erro: impossivel dividir por zero.\n");
						continue;
					}
					System.out.printf("%.2f / %.2f = %.2f", v1, v2, (v1 / v2) );
					break;
				case 4:
					System.out.printf("%.2f - %.2f = %.2f",v1, v2, (v1 - v2) );
					break;
			}
			System.out.printf("\n\n");
		}
	}
}
