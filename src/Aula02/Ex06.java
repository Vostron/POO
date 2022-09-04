package Aula02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float dolar, qtd;
		
		System.out.printf("Informe a cotacao do dolar: ");
		dolar = ler.nextFloat();
		
		System.out.printf("Informe quantos dolares deseja converter: ");
		qtd = ler.nextFloat();
		
		System.out.printf("U$%.2f equivalem a R$%.2f", qtd, (qtd * dolar));
	}
}
