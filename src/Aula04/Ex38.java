package Aula04;

import java.util.Scanner;

public class Ex38 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int sum = 0;
		
		for(int i = 1; i <= 100; i++)
			sum += i;
		
		System.out.printf("A soma dos inteiros positivos de 1 a 100 e: %d", sum);
	}
}
