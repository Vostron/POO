package Aula04;

import java.util.Scanner;

public class Ex31 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float i;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			i = ler.nextFloat();
		}while(i >= 0);
		
		System.out.printf("Voce digitou um numero negativo");
		
	}
}