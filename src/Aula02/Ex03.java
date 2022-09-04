package Aula02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double base, altura;
		
		System.out.printf("Digite a altura do triangulo (em cm): ");
		altura = ler.nextDouble();
		
		System.out.printf("Digite a base do triangulo (em cm): ");
		base = ler.nextDouble();
		
		System.out.printf("A area do triangulo e %.2f cm quadrados", (base*altura)/2);
	}
}
