package Aula07_Ex55;

import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Cliente[] listaClientes = new Cliente[5];
		
		for(int i = 0; i < 5; i++) {
			listaClientes[i] = new Cliente();
			listaClientes[i].setId(i);
			
			System.out.printf("Informe o nome do cliente: ");
			String nome = ler.next();
			listaClientes[i].setNome(nome);
			
			System.out.printf("Informe a idade do cliente: ");
			int idade = ler.nextInt();
			listaClientes[i].setIdade(idade);
			
			System.out.printf("Informe o email do cliente: ");
			String email = ler.next();
			listaClientes[i].setEmail(email);
			
			System.out.printf("O cliente possui conta bancaria? [S/N] ");
			
			if(ler.next().equalsIgnoreCase("s")) {
				ContaBancaria conta = new ContaBancaria();
				
				System.out.printf("Informe a agencia bancaria: ");
				String agencia = ler.next();
				conta.setAgencia(agencia);
				
				System.out.printf("Informe o numero da conta: ");
				String numero = ler.next();
				conta.setNumero(numero);
				
				System.out.printf("Informe o saldo da conta: ");
				double saldo = ler.nextDouble();
				conta.setSaldo(saldo);
				
				listaClientes[i].setConta(conta);
			}
			System.out.println("====================");
		}
		
		System.out.println("\nExibindo dados dos clientes cadastrados:");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\n====================");
			System.out.println(listaClientes[i].exibirNomeIdade());
			
			if(listaClientes[i].getConta() != null)
				System.out.println(listaClientes[i].exibirDadosConta());
		}
	}
}
