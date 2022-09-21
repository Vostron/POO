package Aula04;

import java.util.Scanner;

public class Ex47 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fatorial, memFat;
		double f;
		char resp;
		do {
			f = 1;
			System.out.printf("Digite o numero para calcular o fatorial: ");
			fatorial = ler.nextInt();
			memFat = fatorial;
			while(fatorial > 1) {
				f *= fatorial;
				fatorial--;
			}
			System.out.printf("\nO fatorial de %d e: %.0f\n", memFat, f);
			System.out.printf("Deseja calcular outro fatorial (S/N) ? ");
			resp = ler.next().charAt(0);
		}while(resp == 'S');
	}
}
