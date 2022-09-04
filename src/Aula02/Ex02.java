package Aula02;

import java.util.Scanner;

public class Ex02 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double aresta;
		
		System.out.printf("Digite o valor da aresta de um quadrado qualquer (em cm): ");
		aresta = ler.nextDouble();
		
		System.out.printf("A area do quadrado e %.2f cm quadrados", aresta*aresta);
	}
}
