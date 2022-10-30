package Aula8_Ex60;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Programa {

	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		int opt, id, idCliente;
		double valor;
		Cliente cliente, clienteOrigem = null, clienteDestino = null;
		
		for(;;) {
			System.out.printf(
					"############################################################################################\n" +
					"##                                                                                        ##\n" +
					"##  $$$$$$$\\                                                                              ##\n" +
					"##  $$  __$$\\                                                                             ##\n" +
					"##  $$ |  $$ | $$$$$$\\  $$$$$$$\\   $$$$$$$\\  $$$$$$\\                                      ##\n" +
					"##  $$$$$$$\\ | \\____$$\\ $$  __$$\\ $$  _____|$$  __$$\\                                     ##\n" +
					"##  $$  __$$\\  $$$$$$$ |$$ |  $$ |$$ /      $$ /  $$ |                                    ##\n" +
					"##  $$ |  $$ |$$  __$$ |$$ |  $$ |$$ |      $$ |  $$ |                                    ##\n" +
					"##  $$$$$$$  |\\$$$$$$$ |$$ |  $$ |\\$$$$$$$\\ \\$$$$$$  |                                    ##\n" +
					"##  \\_______/  \\_______|\\__|  \\__| \\_______| \\______/                                     ##\n" +
					"##                                                                                        ##\n" +
					"##                                                                                        ##\n" +
					"##                                                                                        ##\n" +
					"##  $$\\      $$\\                                                                          ##\n" +
					"##  $$$\\    $$$ |                                                                         ##\n" +
					"##  $$$$\\  $$$$ | $$$$$$\\   $$$$$$$\\  $$$$$$\\  $$\\   $$\\ $$\\    $$\\  $$$$$$\\   $$$$$$\\    ##\n" +
					"##  $$\\$$\\$$ $$ | \\____$$\\ $$  _____|$$  __$$\\ $$ |  $$ |\\$$\\  $$  |$$  __$$\\ $$  __$$\\   ##\n" +
					"##  $$ \\$$$  $$ | $$$$$$$ |$$ /      $$ /  $$ |$$ |  $$ | \\$$\\$$  / $$$$$$$$ |$$ |  \\__|  ##\n" +
					"##  $$ |\\$  /$$ |$$  __$$ |$$ |      $$ |  $$ |$$ |  $$ |  \\$$$  /  $$   ____|$$ |        ##\n" +
					"##  $$ | \\_/ $$ |\\$$$$$$$ |\\$$$$$$$\\ \\$$$$$$$ |\\$$$$$$$ |   \\$  /   \\$$$$$$$\\ $$ |        ##\n" +
					"##  \\__|     \\__| \\_______| \\_______| \\____$$ | \\____$$ |    \\_/     \\_______|\\__|        ##\n" +
					"##                                   $$\\   $$ |$$\\   $$ |                                 ##\n" +
					"##                                   \\$$$$$$  |\\$$$$$$  |                                 ##\n" +
					"##                                    \\______/  \\______/                                  ##\n" +
					"##                                                                                        ##\n" +
					"############################################################################################\n\n" +
					"Escolha a opcao desejada: \n" +
					"[1] - Criar cliente e conta\n" +
					"[2] - Depositar\n" +
					"[3] - Sacar\n" +
					"[4] - Transferir\n" +
					"[5] - Consultar saldo\n" +
					"[6] - Consultar extrato\n" +
					"[7] - Sair\n" +
					"Opcao escolhida: ");
			opt = ler.nextInt();
			
			switch(opt) {
				case 1:
					//Criar cliente e conta
					cliente = new Cliente();
					cliente.setId((listaClientes.size() > 0) ? listaClientes.get(listaClientes.size() - 1).getId() + 1 : 1);
					
					System.out.println("Cadastro de cliente: \n");
					
					System.out.println("Digite o nome do cliente: ");
					cliente.setNome(ler.next());
					
					System.out.println("Digite a idade do cliente: ");
					cliente.setIdade(ler.nextInt());
					
					ContaBancaria conta = new ContaBancaria();
					Random rand = new Random();
					
					conta.setNumero(
							String.valueOf(rand.nextInt(40)) +
							String.valueOf(cliente.getId()));
					
					cliente.setConta(conta);
					listaClientes.add(cliente);
					
					System.out.println("Cliente e conta cadastrados com sucesso!");
					
					System.out.println("Pressione enter para continuar...");
					System.in.read();										
					break;
					
				case 2:
					//Depositar
					if(listaClientes.size() == 0) {
						System.out.println("Nenhum cliente cadastrado.");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"+------+----------------------------------------+--------------+\n" +
							"|  ID  |                  Nome                  |    Saldo     |\n" +
							"+------+----------------------------------------+--------------+\n");
					for(Cliente c: listaClientes)
						System.out.printf(
								"| %-4d | %-38s | R$ %-9.2f |\n" +
								"+------+----------------------------------------+--------------+\n",
								c.getId(), c.getNome(), c.getConta().getSaldo());
					
					System.out.println("Digite o ID do cliente que deseja depositar: ");
					id = ler.nextInt();
					
					idCliente = -1;						
					for(Cliente c: listaClientes) {
						if(c.getId() == id) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					if(idCliente != -1) {
						cliente = listaClientes.get(idCliente);
						
						System.out.printf("Digite o valor do deposito: R$ ");
						valor = ler.nextDouble();
						while(valor < 0) {
							System.out.print("Erro: Valor inválido. Digite um valor positivo para depositar.");
							valor = ler.nextDouble();
						}
							
						cliente.getConta().Depositar(valor, false);
						
						System.out.println("Deposito realizado com sucesso!");
					} else {
						System.out.println("Cliente nao localizado.");
					}
						
					System.out.println("Pressione enter para continuar...");
					System.in.read();					
					break;
					
				case 3:
					//Sacar
					if(listaClientes.size() == 0) {
						System.out.println("Nenhum cliente cadastrado.");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"+------+----------------------------------------+--------------+\n" +
							"|  ID  |                  Nome                  |    Saldo     |\n" +
							"+------+----------------------------------------+--------------+\n");
					for(Cliente c: listaClientes)
						System.out.printf(
								"| %-4d | %-38s | R$ %-9.2f |\n" +
								"+------+----------------------------------------+--------------+\n",
								c.getId(), c.getNome(), c.getConta().getSaldo());
					
					System.out.println("Digite o ID do cliente que deseja sacar: ");
					id = ler.nextInt();
					idCliente = -1;						
					for(Cliente c: listaClientes) {
						if(c.getId() == id) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					if(idCliente != -1) {
						cliente = listaClientes.get(idCliente);						
						System.out.print("Digite o valor do saque: R$ ");
						valor = ler.nextDouble();
						while(valor < 0) {
							System.out.print("Erro: Valor invalido. Digite um valor positivo para sacar.");
							valor = ler.nextDouble();
						}
						if(cliente.getConta().Sacar(valor,  false))
							System.out.print("Saque realizado com sucesso!");
						else
							System.out.print("Saldo insuficiente.");						
					} else {
						System.out.print("Cliente nao localizado.");
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
				case 4:
					//Transferir
					if(listaClientes.size() < 2) {
						System.out.println("Quantidade insuficiente de clientes para realizar transferencias.");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					int exec = 0;
					
					do {
						System.out.printf(
								"+------+----------------------------------------+---------+-------+--------------+\n" +
								"|  ID  |                  Nome                  | Agencia | Conta |    Saldo     |\n" +
								"+------+----------------------------------------+---------+-------+--------------+\n");
						for(Cliente c: listaClientes)
							System.out.printf(
									"| %-4d | %-38s | %-7s | %-5s | R$ %-9.2f |\n" +
									"+------+----------------------------------------+---------+-------+--------------+\n",
									c.getId(), c.getNome(), c.getConta().getAgencia(), c.getConta().getNumero(), c.getConta().getSaldo());
						
						System.out.println((exec == 0) ? "Digite o ID do cliente de origem: " : "Digite o ID do cliente de destino: ");
						id = ler.nextInt();
						
						idCliente = -1;						
						for(Cliente c: listaClientes) {
							if(c.getId() == id) {
								idCliente = listaClientes.indexOf(c);
								break;
							}
						}
						
						if(idCliente != -1) {
							if(exec == 0) {
								clienteOrigem = listaClientes.get(idCliente);
								exec++;
							} else {
								if(clienteOrigem != clienteDestino) {
									clienteDestino = listaClientes.get(idCliente);
									exec++;
								} else {
									System.out.println("Erro: Cliente de origem e o mesmo de destino.");
								}										
							}
						} else {
							System.out.println("ID invalida. Tente novamente.\n");
						}							
					}while(exec < 2);
					
					System.out.println("Digite o valor da transferencia: R$ ");
					valor = ler.nextDouble();
					
					while(valor < 0) {
						System.out.printf("Erro: Valor invalido. Digite um valor positivo para transferir.\nDigite o valor da transferencia: R$ ");
						valor = ler.nextDouble();
					}
					
					if(clienteOrigem.getConta().getSaldo() + clienteOrigem.getConta().getLimite() >= valor) {
						clienteOrigem.getConta().Transferir(valor, clienteOrigem, clienteDestino);
						System.out.print("Transferencia realizada com sucesso!");
					} else {
						System.out.print("Erro: Saldo insuficiente.");
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
				case 5:
					//Consultar saldo
					System.out.printf(
							"+------+----------------------------------------+---------+-------+\n" +
							"|  ID  |                  Nome                  | Agencia | Conta |\n" +
							"+------+----------------------------------------+---------+-------+\n");
					for(Cliente c: listaClientes)
						System.out.printf(
								"| %-4d | %-38s | %-7s | %-5s |\n" +
								"+------+----------------------------------------+---------+-------+\n",
								c.getId(), c.getNome(), c.getConta().getAgencia(), c.getConta().getNumero());
					
					System.out.println("Digite o ID do cliente que deseja visualizar o saldo: ");
					id = ler.nextInt();
					
					idCliente = -1;						
					for(Cliente c: listaClientes) {
						if(c.getId() == id) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					if(idCliente != -1) {
						cliente = listaClientes.get(idCliente);
						System.out.printf("Saldo; R$ %.2f\n", cliente.getConta().getSaldo());
					} else {
						System.out.print("Erro: Cliente nao localizado.");
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
				case 6:
					//Consultar extrato
					System.out.printf(
							"+------+----------------------------------------+---------+-------+\n" +
							"|  ID  |                  Nome                  | Agencia | Conta |\n" +
							"+------+----------------------------------------+---------+-------+\n");
					for(Cliente c: listaClientes)
						System.out.printf(
								"| %-4d | %-38s | %-7s | %-5s |\n" +
								"+------+----------------------------------------+---------+-------+\n",
								c.getId(), c.getNome(), c.getConta().getAgencia(), c.getConta().getNumero());
					
					System.out.println("Digite o ID do cliente que deseja visualizar o extrato: ");
					id = ler.nextInt();
					
					idCliente = -1;						
					for(Cliente c: listaClientes) {
						if(c.getId() == id) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					if(idCliente != -1) {
						cliente = listaClientes.get(idCliente);
						System.out.print(cliente.getConta().ConsultarExtrato());
					} else {
						System.out.print("Erro: Cliente nao localizado.");
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
				case 7:
					System.exit(0);
					break;
				default:
					System.out.printf("\nOpcao invalida.\n");
					break;
			}
		}
		
	}

}
