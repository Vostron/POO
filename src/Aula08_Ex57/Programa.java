package Aula08_Ex57;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		int opt, nextId, idCliente;
		
		do {
			System.out.printf(
					"+-------------------------------+\n" + 
					"| Sistema de gestao de clientes |\n" +
					"+-------------------------------+\n\n" +
					"Escolha uma opcao: \n" + 
					"[1] - Cadastrar cliente\n" +
					"[2] - Atualizar cadastro\n" +
					"[3] - Excluir cliente\n" +
					"[4] - Exibir clientes\n" +
					"[5] - Sair\n" +
					"Opcao selecionada: "
					);
			opt = ler.nextInt();
			
			switch(opt) {
				case 1:
					Cliente cliente = new Cliente();
					nextId = (listaClientes.size() > 0) ? listaClientes.get(listaClientes.size() - 1).getId() + 1 : 1;
					
					cliente.setId(nextId);
					
					System.out.print("Digite o nome do cliente: ");
					cliente.setNome(ler.next());
					
					System.out.print("Digite a idade do cliente: ");
					cliente.setIdade(ler.nextInt());
					
					System.out.print("Digite o e-mail do cliente: ");
					cliente.setEmail(ler.next());
					
					System.out.print("O cliente possui conta bancaria? [S/N]: ");
					if(ler.next().equalsIgnoreCase("s")) {
						ContaBancaria conta = new ContaBancaria();
						
						System.out.print("Digite a agencia: ");
						conta.setAgencia(ler.next());
						
						System.out.print("Digite o numero da conta: ");
						conta.setNumero(ler.next());
						
						System.out.print("Digite o saldo: ");
						conta.setSaldo(ler.nextDouble());
						
						cliente.setConta(conta);
						
					} else {
						cliente.setConta(null);
					}
					
					listaClientes.add(cliente);
					
					System.out.println("Cliente incluido com sucesso!");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					
					break;
					
				case 2:
					System.out.println("+----+--------------------------------------+-------+----------------------+");
					System.out.println("| ID |                 Nome                 | Idade |        E-mail        +");
					System.out.println("+----+--------------------------------------+-------+----------------------+");
					for(Cliente c: listaClientes) {
						System.out.printf(
								"| %-2d | %-36s | %-5d | %-20s |\n",
								c.getId(), c.getNome(), c.getIdade(), c.getEmail());
						System.out.println("+----+--------------------------------------+-------+----------------------+");
					}
					
					System.out.printf("\n\nDigite a ID do cliente que deseja atualizar: ");
					int idToEdit = ler.nextInt();
					idCliente = -1;
					
					for(Cliente c: listaClientes) {
						if(c.getId() == idToEdit) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					
					if(idCliente != -1) {
						Cliente clienteToEdit = listaClientes.get(idCliente);
						
						System.out.print("Digite o novo nome do cliente: ");
						clienteToEdit.setNome(ler.next());
						
						System.out.print("Digite a nova idade do cliente: ");
						clienteToEdit.setIdade(ler.nextInt());
						
						System.out.print("Digite o novo e-mail do cliente: ");
						clienteToEdit.setEmail(ler.next());
						
						System.out.println("Cliente atualizado com sucesso!");
					} else {
						System.out.println("Cliente nao encontrado.");
					}
					
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					
					break;
					
				case 3:
					System.out.println("+----+--------------------------------------+-------+----------------------+");
					System.out.println("| ID |                 Nome                 | Idade |        E-mail        +");
					System.out.println("+----+--------------------------------------+-------+----------------------+");
					for(Cliente c: listaClientes) {
						System.out.printf(
								"| %-2d | %-36s | %-5d | %-20s |\n",
								c.getId(), c.getNome(), c.getIdade(), c.getEmail());
						System.out.println("+----+--------------------------------------+-------+----------------------+");
					}
					
					System.out.printf("\n\nDigite a ID do cliente que deseja excluir: ");
					int idToDelete = ler.nextInt();
					idCliente = -1;
					
					for(Cliente c: listaClientes) {
						if(c.getId() == idToDelete) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					if(idCliente != -1) {
						listaClientes.remove(idCliente);
						System.out.println("Cliente removido com sucesso!");
					} else {
						System.out.printf("Cliente nao localizado");
					}
					
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					
					break;
					
				case 4:					
					System.out.println("+----+--------------------------------------+-------+----------------------+");
					System.out.println("| ID |                 Nome                 | Idade |        E-mail        +");
					System.out.println("+----+--------------------------------------+-------+----------------------+");					
					for(Cliente c: listaClientes) {
						System.out.printf(
								"| %-2d | %-36s | %-5d | %-20s |\n",
								c.getId(), c.getNome(), c.getIdade(), c.getEmail());
						
						if(c.getConta() != null) {
							System.out.println("+----+----------------+----------------+----+-------+----------------------+");
							System.out.println("|       Agencia       |     Numero     |               Saldo               |");
							System.out.println("+---------------------+----------------+-----------------------------------+");
							System.out.printf("| %-19s | %-14s | R$ %-30.2f |\n",
									c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().getSaldo());
							System.out.println("+----+----------------+----------------+----+-------+----------------------+");
						} else {
							System.out.println("+----+--------------------------------------+-------+----------------------+");
						}
					}
					
					break;
			}
			
		}while(opt != 5);
	}

}
