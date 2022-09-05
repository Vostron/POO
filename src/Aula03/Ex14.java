package Aula03;

import java.util.Scanner;

public class Ex14 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		float altura, peso;
		
		System.out.printf("Informe sua altura (cm): ");
		altura = ler.nextFloat();
		
		System.out.printf("Informe seu peso (kg): ");
		peso = ler.nextFloat();
		
		float imc = (peso / (altura * altura)) * 10000;
		
		if((imc >= 18.5) && (imc <= 24.9))
			System.out.printf("Peso ideal");
		else
			System.out.printf("Peso nao ideal");
	}
}
