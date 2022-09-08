package Aula03;

import java.util.Scanner;

public class Ex30 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float preco;
		int opt;
		
		System.out.printf("Digite o preco do produto: R$");
		preco = ler.nextFloat();
		
		do {
			System.out.printf("Condicao de pagamento: \n"
					+ "[1] - A vista em dinheiro ou cheque\n"
					+ "[2] - A vista no cartao de credito\n"
					+ "[3] - Em duas vezes\n"
					+ "[4] - Em quatro vezes\n"
					+ "Opcao selecionada: ");
			opt = ler.nextInt();
			
			if(opt > 4 || opt < 1)
				System.out.printf("## Opcao invalida. ##\n");
			
		}while(opt > 4 || opt < 1);
		
		switch(opt) {
			case 1:
				System.out.printf("Preco a pagar: R$%.2f", preco * 0.9);
				break;
			case 2:
				System.out.printf("Preco a pagar: R$%.2f", preco * 0.85);
				break;
			case 3:
				System.out.printf("Preco a pagar: R$%.2f", preco);
				break;
			case 4:
				System.out.printf("Preco a pagar: R$%.2f", preco * 1.1);
				break;
		}
	}
}
