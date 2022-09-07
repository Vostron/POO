package Aula03;

import java.util.Scanner;

public class Ex25 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float x;
		
		System.out.printf("Digite um numero: ");
		x = ler.nextFloat();
		
		if(x % 2 == 0)
			System.out.printf("O numero digitado e par.");
		else
			System.out.printf("O numero digitado e impar.");
	}
}
