package Aula03;

import java.util.Scanner;

public class Ex27 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float x;
		
		System.out.printf("Digite um numero: ");
		x = ler.nextFloat();
		
		if(x % 2 == 0)
			System.out.printf("%.2f + 5 = %.2f", x, x + 5);
		else
			System.out.printf("%.2f + 8 = %.2f", x, x + 8);
	}
}
