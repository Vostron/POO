package Aula04;

import java.util.Scanner;

public class Ex33 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		char sexo;
		
		for(;;) {
			System.out.printf("Digite o sexo do usuario (M ou F): ");
			sexo = ler.nextLine().charAt(0);
			
			if(!(sexo == 'M' || sexo == 'F'))
				break;		
		}
		System.out.printf("Caractere invalido digitado.");
	}
}
