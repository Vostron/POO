package Aula04;

import java.util.Scanner;

public class Ex32 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, b;
		
		System.out.printf("Digite um numero: ");
		a = ler.nextFloat();
		
		do {
			System.out.printf("Digite outro numero (maior que o primeiro): ");
			b = ler.nextFloat();		
		}while(b < a);
		
		System.out.printf("Fim do programa.");
	}
}
