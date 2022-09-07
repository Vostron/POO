package Aula03;

import java.util.Scanner;

public class Ex17 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float p, a, imc;
		char s;
		
		do {
			System.out.printf("Informe seu sexo [ F | M ]: ");
			s = ler.nextLine().charAt(0);
		}while(!(s == 'F' || s == 'M'));
		
		System.out.printf("Informe sua altura (em cm): ");
		a = (ler.nextFloat())/100;
		
		System.out.printf("Informe seu peso (em kg): ");
		p = ler.nextFloat();
		
		imc = p / (a * a);
		
		System.out.printf("Seu IMC: %.1f\n", imc);
		
		switch (s) {
			case 'F':
				if(imc < 19)
					System.out.printf("Voce esta abaixo do peso");
				else if(imc >= 19 && imc < 24)
					System.out.printf("Voce esta com peso ideal");
				else
					System.out.printf("Voce esta acima do peso");
				break;
				
			case 'M':
				if(imc < 20)
					System.out.printf("Voce esta abaixo do peso");
				else if(imc >= 20 && imc < 25)
					System.out.printf("Voce esta com peso ideal");
				else
					System.out.printf("Voce esta acima do peso");
				break;
		}
		
		
	}
}
