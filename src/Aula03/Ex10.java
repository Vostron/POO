package Aula03;

import java.util.Scanner;

public class Ex10 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		float v1, v2;
		
		System.out.printf("Informe o 1o numero: ");
		v1 = ler.nextFloat();
		
		System.out.printf("Informe o 2o numero: ");
		v2 = ler.nextFloat();
		
		if(v1 > v2)
			System.out.printf("%.2f e maior que %.2f", v1, v2);
		else if(v2 > v1)
			System.out.printf("%.2f e maior que %.2f", v2, v1);
		else
			System.out.printf("Os numeros sao iguais");
	}
}
