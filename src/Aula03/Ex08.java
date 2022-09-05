package Aula03;

import java.util.Scanner;

public class Ex08 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float v1, v2;
		
		System.out.printf("Informe o 1o numero: ");
		v1 = ler.nextFloat();
		
		System.out.printf("Informe o 2o numero: ");
		v2 = ler.nextFloat();
		
		if(v1 > v2)
			System.out.printf("O maior valor e %.2f", v1);
		
		if(v2 > v1)
			System.out.printf("O maior valor e %.2f", v2);
	}
}
