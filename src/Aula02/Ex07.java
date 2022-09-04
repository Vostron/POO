package Aula02;

import java.util.Scanner;

public class Ex07 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		float cash, sum = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("Digite o preco do %d produto: ", i+1);
			sum += ler.nextFloat();
		}
		
		System.out.printf("O valor da compra e R$%.2f\nDigite o valor recebido:", sum);
		cash = ler.nextFloat();
		
		System.out.printf("O troco e R$%.2f", (cash - sum));
	}
}
