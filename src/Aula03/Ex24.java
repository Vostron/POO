package Aula03;

import java.util.Scanner;

public class Ex24 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int estadoCivil, tempoCasamento;
		char sexo;
		String[] estadosCivis = {"Solteiro(a)", "Casado(a)", "Divorciado(a)", "Viuvo(a)"};
		
		System.out.printf("Informe seu nome: ");
		nome = ler.nextLine();
		
		do {
			System.out.printf("Informe seu sexo [ F | M]: ");
			sexo = ler.nextLine().charAt(0);
			if(!(sexo == 'M' || sexo == 'F'))
				System.out.printf("## Opcao invalida. ##\n");
			
		} while(!(sexo == 'M' || sexo == 'F'));
		
		do {
			System.out.printf("Informe seu estado civil: \n"
					+ "[1] - Solteiro(a)\n"
					+ "[2] - Casado(a)\n"
					+ "[3] - Divorciado(a)\n"
					+ "[4] - Viuvo(a)\n"
					+ "Opcao selecionada: ");
			estadoCivil = ler.nextInt();
			
			if(estadoCivil < 1 || estadoCivil > 4)
				System.out.printf("## Opcao invalida. ##\n");
			
		} while(estadoCivil < 1 || estadoCivil > 4);
		
		if(estadoCivil == 2 && sexo == 'F') {
			System.out.printf("Informe o tempo de casamento (anos): ");
			tempoCasamento = ler.nextInt();
			System.out.printf("Dados lidos: \n"
					+ "Nome: %s\n"
					+ "Sexo: %s\n"
					+ "Estado Civil: %s\n"
					+ "Tempo de casamento: %d anos",
					nome, (sexo == 'M') ? "Masculino" : "Feminino", estadosCivis[estadoCivil], tempoCasamento);
		} else { 
			System.out.printf("Dados lidos: \n"
					+ "Nome: %s\n"
					+ "Sexo: %s\n"
					+ "Estado Civil: %s\n",
					nome, (sexo == 'M') ? "Masculino" : "Feminino", estadosCivis[estadoCivil]);
		}		
	}
}
