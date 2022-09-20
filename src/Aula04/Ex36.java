package Aula04;

import java.util.Scanner;

public class Ex36 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x, intInicio, intFim;
		
		do {
			System.out.printf("Digite um numero positivo: ");
			x = ler.nextInt();
			
			if(x < 0)
				System.out.printf("Apenas numeros positivos sao aceitos. \n");
		}while(x < 0);
		
		
		System.out.printf("Informe o inicio do intervalo para calculo da tabuada do numero %d: ", x);
		intInicio = ler.nextInt();
		
		do {
			System.out.printf("Informe o fim do intervalo para calculo da tabuada do numero %d: ", x);
			intFim = ler.nextInt();
			
			if(intFim <= intInicio)
				System.out.printf("O valor final do intervalo devera ser maior que o inicial.\n");
		}while(intFim <= intInicio);
		
		for(int i = intFim; i >= intInicio; i--)
			System.out.printf("%d x %d = %d\n", i, x, (i * x));
	}
}
