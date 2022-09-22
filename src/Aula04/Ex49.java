package Aula04;

import java.util.Scanner;

public class Ex49 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, sum = 0, mem;
		
		System.out.printf("Digite o primeiro numero do intervalo (inicio): ");
		a = ler.nextInt();
		mem = a;
		
		System.out.printf("Digite o segundo numero do intervalo (fim): ");
		b = ler.nextInt();
		
		for(int i = (a - 1); i < b; i++) {
			sum += a;
			a++;
		}
		
		System.out.printf("\nA soma dos numeros entre %d e %d e %d", mem, b, sum);
	}
}
