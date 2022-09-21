package Aula04;

import java.util.Scanner;

public class Ex45 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int t;
		float[] v = new float[10];
		float min = 0, max = 0, sum = 0, avg;
		float contP = 0, contN = 0;
		
		do {
			System.out.printf("Digite a quantidade de numeros que serao digitados (ate 19): ");
			t = ler.nextInt();
			if(t > 19 || t <= 0)
				System.out.printf("O numero devera ser maior que zero e menor que 20.");
		}while(t > 19 || t <= 0);
		
		for(int i = 0; i < t; i++) {
			System.out.printf("\nDigite um numero: ");
			v[i] = ler.nextFloat();

			if(i == 0) {
				max = v[i];
				min = v[i];
				sum = v[i];
			} else {
				if(v[i] < min)
					min = v[i];
				if(v[i] > max)
					max = v[i];
				sum += v[i];
			}
			
			if(v[i] >= 0)
				contP++;
			else
				contN++;
		}
		avg = sum/t;
		
		System.out.printf("\n"
				+ "O menor valor digitado: %.2f\n"
				+ "O maior valor digitado: %.2f\n"
				+ "A soma dos valores digitados: %.2f\n"
				+ "A media dos valores digitados: %.2f\n"
				+ "A porcentagem de valores positivos: %.2f%% \n"
				+ "A porcentagem de valores negativos: %.2f%%", min, max, sum, avg, (contP / t) * 100, (contN / t) * 100);
	}
}
