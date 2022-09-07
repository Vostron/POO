package Aula02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double[] v = new double[4];
		double sum = 0;
		
		for(int i = 0; i < 4; i++) {
			System.out.printf("Insira o %d valor: ", (i+1));
			v[i] = ler.nextDouble();
		}
		
		for(int i = 0; i < 4; i++)
			sum += v[i];
		
		System.out.printf("A media dos valores digitados e %.2f", sum/4);
		
	}
}
