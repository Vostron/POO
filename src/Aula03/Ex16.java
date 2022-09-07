package Aula03;

import java.util.Scanner;

public class Ex16 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int c1, c2, h;
		
		System.out.printf("Digite o tamanho da hipotenusa: ");
		h = ler.nextInt();
		
		System.out.printf("Digite o tamanho de um dos catetos: ");
		c1 = ler.nextInt();
		
		System.out.printf("Digite o tamanho do outro cateto: ");
		c2 = ler.nextInt();
		
		if( (h*h) == (c1*c1) + (c2*c2) )
			System.out.printf("Os dados digitados correspondem a um triangulo retangulo");
		else
			System.out.printf("Os dados digitados nao correspondem a um triangulo retangulo");
		
	}
}
