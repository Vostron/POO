package Aula02;

import java.util.Scanner;

public class Ex05 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float c, f;
		
		System.out.printf("Informe a temperatura em graus Celsius: ");
		c = ler.nextFloat();
		
		f = (c * 9/5) + 32;
		
		System.out.printf("%.2f graus Celsius equivalem a %.2f graus Fahrenheit", c, f);
	}
}
