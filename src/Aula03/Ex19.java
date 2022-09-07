package Aula03;

import java.util.Scanner;

public class Ex19 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float p1, p2, media;
		
		System.out.printf("Informe a nota P1: ");
		p1 = ler.nextFloat();
		
		System.out.printf("Informe a nota P2: ");
		p2 = ler.nextFloat();
		
		media = (p1 + (2 * p2)) / 3;
		
		if(media >= 5)
			System.out.printf("Nota final %.2f. Resultado: Aprovado", media);
		else
			System.out.printf("Nota final %.2f. Resultado: Reprovado", media);
	}
}
