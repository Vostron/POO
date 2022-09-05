package Aula03;

import java.util.Scanner;

public class Ex12 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		float b, a;
		
		System.out.printf("Informe o tamanho da base (cm): ");
		b = ler.nextFloat();
		
		System.out.printf("Informe o tamanho da altura (cm): ");
		a = ler.nextFloat();
		
		System.out.printf("Tamanho da area: %.2f cm quadrados", (b*a));
		
		if((b*a) > 100)
			System.out.printf("\nTerreno grande");
		else
			System.out.printf("\nTerreno pequeno");
	}
}
