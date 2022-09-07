package Aula03;

import java.util.Scanner;

public class Ex29 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, z;
		
		System.out.printf("Digite um numero: ");
		x = ler.nextInt();
		
		do {
			System.out.printf("Digite um numero: ");
			y = ler.nextInt();
			
			if(y == x)
				System.out.printf("O valor devera ser diferente de %d\n", x);
		}while (y == x);
		
		do {
			System.out.printf("Digite um numero: ");
			z = ler.nextInt();
			
			if(z == x || z == y)
				System.out.printf("O valor devera ser diferente de %d e %d\n", x, y);
			
		}while(z == x || z == y);
		
		if (x > y && y > z)
			System.out.printf("A ordem decrescente: %d, %d, %d.\n", x, y, z);
		else if (x > z && z > y)
			System.out.printf("A ordem decrescente: %d, %d, %d.\n", x, z, y);
		else if (y > x && x > z)
			System.out.printf("A ordem decrescente: %d, %d, %d.\n", y, x, z);
		else if (y > z && z > x) 
			System.out.printf("A ordem decrescente: %d, %d, %d.\n", y, z, x);
		else if (z > x && x > y) 
			System.out.printf("A ordem decrescente: %d, %d, %d.\n", z, x, y);
		else
			System.out.printf("A ordem decrescente: %d, %d, %d.\n", z, y, x);

	}
}
