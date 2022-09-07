package Aula03;

import java.util.Scanner;

public class Ex20 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float p1, p2;
		
		System.out.printf("Informe a nota P1: ");
		p1 = ler.nextFloat();
		
		p2 = ((5*3) - p1)/2;
		
		System.out.printf("Voce precisa obter nota %.2f na P2 para ser aprovado.", p2);
	}
}
