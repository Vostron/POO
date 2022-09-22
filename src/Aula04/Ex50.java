package Aula04;

import java.util.Scanner;

public class Ex50 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b;
		
		System.out.printf("Digite o inicio do intervalo fechado: ");
		a = ler.nextInt();
		
		System.out.printf("Digite o fim do intervalo fechado: ");
		b = ler.nextInt();
		
		System.out.println("No intervalo digitado, esses sao os numeros pares maiores que 10:");
		
		for(int i = a; i < b; i++)
			if( (i%2 == 0)  && i > 10)
				System.out.printf("%d, ", i);
	}
}
