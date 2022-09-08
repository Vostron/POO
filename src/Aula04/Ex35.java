package Aula04;

import java.util.Scanner;

public class Ex35 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			a = ler.nextInt();
		}while(a <= 0);
		
		for(int i = 0; i < 10; i++) 
			System.out.printf("%d x %d = %d\n", (i+1), a, (i+1)*a);
		
	}
}
