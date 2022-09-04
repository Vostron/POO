package Aula02;

import java.util.Scanner;

public class Ex01 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double base, altura;
		
		System.out.printf("Digite a base do retangulo (em cm): ");
		base = ler.nextDouble();
		
		System.out.printf("Digite a altura do retangulo (em cm): ");
		altura = ler.nextDouble();
		
		System.out.printf("A area do retangulo e: %.2f cm quadrados.", (base*altura));
	}
}
