package Aula03;

import java.util.Scanner;

public class Ex23 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float a, b, c;
		
		System.out.printf("Insira o valor A: ");
		a = ler.nextFloat();
		
		System.out.printf("Insira o valor B: ");
		b = ler.nextFloat();
		
		System.out.printf("Insira o valor C: ");
		c = ler.nextFloat();
		
		if( (a + b) < c)
			System.out.printf("A soma (%.2f) de A (%.2f) + B (%.2f) e menor que C (%.2f)", (a + b), a, b, c);
		else
			System.out.printf("A soma (%.2f) de A (%.2f) + B (%.2f) nao e menor que C (%.2f)", (a + b), a, b, c);
	}
}