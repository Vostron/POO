package Aula04;

import java.util.Scanner;

public class Ex44 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float[] v = new float[10];
		float max = 0, sum = 0, avg;
		
		for(int i = 0; i < 10; i++) {
			do {
				System.out.printf("\nDigite um numero positivo: ");
				v[i] = ler.nextFloat();
				
				if(v[i] < 0)
					System.out.printf("\nO valor digitado nao e positivo.");
				
			}while(v[i] < 0);
			
			if(i == 0) {
				max = v[i];
				sum = v[i];
			} else {
				if(v[i] > max)
					max = v[i];
				sum += v[i];
			}			
		}		
		avg = sum/10;
		System.out.printf("\nO maior valor digitado: %.2f\n"
				+ "A soma dos valores digitados: %.2f\n"
				+ "A media dos valores digitados: %.2f", max, sum, avg);
	}
}
