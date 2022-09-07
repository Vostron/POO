package Aula03;

import java.util.Scanner;

public class Ex13 {
	//import java.util.Scanner;
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float[] v = new float[3];
		
		for(int i = 0; i < 3; i++) {
			System.out.printf("Informe o %d valor: ", i+1);
			v[i] = ler.nextFloat();
		}
		
		if((v[0] > v[1]) && (v[0] > v[2]))
			System.out.printf("O maior valor e %.2f", v[0]);
		else if((v[1] > v[0]) && (v[1] > v[2]))
			System.out.printf("O maior valor e %.2f", v[1]);
		else
			System.out.printf("O maior valor e %.2f", v[2]);		
		
	}
}
