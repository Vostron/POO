package Aula03;

import java.util.Scanner;

public class Ex18 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		float vInit, vEnd, acc, t;
		
		System.out.printf("Informe a velocidade inicial (em m/s): ");
		vInit = ler.nextFloat();
		
		System.out.printf("Informe a aceleracao (em (m/s)^2): ");
		acc = ler.nextFloat();
		
		System.out.printf("Informe o tempo (em segundos): ");
		t = ler.nextFloat();
		
		vEnd = (vInit + acc * t);
		vEnd *= 3.6;
		
		System.out.printf("Velocidade final: %.2f km/h\n", vEnd);
		
		if(vEnd <= 40)
			System.out.printf("Veiculo muito lento");
		else if(vEnd > 40 && vEnd <= 60)
			System.out.printf("Velocidade permitida");
		else if(vEnd > 60 && vEnd <= 80)
			System.out.printf("Velocidade de cruzeiro");
		else if(vEnd > 80 && vEnd <= 120)
			System.out.printf("Veiculo rapido");
		else
			System.out.printf("Veiculo mutio rapido");
		
	}
}
