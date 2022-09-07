package Aula03;

import java.util.Scanner;

public class Ex26 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float x;
		
		System.out.printf("Digite um numero: ");
		x = ler.nextFloat();
		
		if(x >= 0)
			System.out.printf("O dobro de %.2f e %.2f", x, x*2);
		else
			System.out.printf("O triplo de %.2f e %.2f", x, x*3);
	}
}
