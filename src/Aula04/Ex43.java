package Aula04;

import java.util.Scanner;

public class Ex43 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);		
		int n;
		double sum = 0, j = 3, x = 0, y = 0;
		do {
			System.out.printf("Informe um numero inteiro positivo menor que 50: ");
			n = ler.nextInt();
			
			if(n <= 0 || n >= 50)
				System.out.printf("\nO numero digitado e invalido:\nDigite um numero inteiro positivo no intervalo de 1 a 50.\n");
			
		}while(n <= 0 || n >= 50);
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				x = 2;
			}else {
				x += j;
				j += 2;
			}
			
			if(i == 0)
				y = 1;
			else
				y = (i + 1) * (i + 1) * (i + 1);
			
			sum += (x/y);
		}
		System.out.printf("A soma dos %d primeiros termos da sequencia eh: %f", n, sum);
	}
}
