package Aula05_Ex42;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Cliente[] listaClientes = new Cliente[5];
		
		
		for(int i = 0; i < 5; i++) {
			listaClientes[i] = new Cliente();			
			listaClientes[i].id = i+1;
			
			System.out.println("Digite o nome do cliente: ");
			listaClientes[i].nome = ler.next();
						
			System.out.println("Digite a idade do cliente: ");
			listaClientes[i].idade = ler.nextInt();
			
			System.out.println("Digite o email do cliente: ");
			listaClientes[i].email = ler.next();
		}
		
		System.out.println("Exibindo todos os clientes com mais de 18 anos: ");
		
		for(int i = 0; i < 5; i++)
			if(listaClientes[i].idade > 18)
				System.out.printf("ID: %d\nNome: %s\nIdade: %d\nE-mail: %s\n\n",
						listaClientes[i].id, listaClientes[i].nome,
						listaClientes[i].idade, listaClientes[i].email
				);
	}
}
