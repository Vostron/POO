package Aula04;

import java.util.Scanner;

public class Ex41 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		int j = 3;
		int sum = 0;
		
		do {
			System.out.printf("Informe um numero inteiro positivo menor que cem: ");
			n = ler.nextInt();
			
			if(n <= 0 || n >= 100)
				System.out.printf("\nO numero digitado e invalido:\nDigite um numero inteiro positivo no intervalo de 1 a 100.\n");
			
		}while(n <= 0 || n >= 100);
		
		
		int[] v = new int[n];
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				v[i] = 2;
			}else {
				v[i] = v[i-1] + j;
				j += 2;
			}
			sum += v[i];
		}
		System.out.printf("A soma dos %d primeiros termos da sequencia eh: %d", n, sum);
	}
}
