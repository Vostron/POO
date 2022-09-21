package Aula04;

import java.util.Scanner;

public class Ex48 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		System.out.printf("Digite um numero inteiro qualquer: ");
		i = ler.nextInt();
		
		System.out.printf("Imprimindo os 20 numeros subsequentes: ");
		for(int j = 0; j < 20; j++) {
			i++;
			System.out.printf("%d", i);
			if(j < 19)
				System.out.printf(", ");
			else
				System.out.printf(".");
		}
	}
}
