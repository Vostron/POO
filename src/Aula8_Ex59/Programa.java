package Aula8_Ex59;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		
		int opt, id, idCliente;
		Cliente cliente, clienteOrigem = null, clienteDestino = null;
		double valorSaque, valorTransferencia;
		
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		
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
					"[5] - Sair\n" +
					"Opcao escolhida: ");
			opt = ler.nextInt();
			
			switch(opt) {
				case 1:
					cliente = new Cliente();
					cliente.setId((listaClientes.size() > 0) ? listaClientes.get(listaClientes.size() - 1).getId() + 1 : 1);
					
					System.out.println("Cadastro de cliente: \n");
					
					System.out.println("Digite o nome do cliente: ");
					cliente.setNome(ler.next());
					
					System.out.println("Digite a idade do cliente: ");
					cliente.setIdade(ler.nextInt());
					
					ContaBancaria conta = new ContaBancaria();
					
					System.out.println("Cadastro de conta bancaria:\n");
					
					System.out.println("Digite a agencia: ");
					conta.setAgencia(ler.next());
					
					System.out.println("Digite o numero: ");
					conta.setNumero(ler.next());
					
					cliente.setConta(conta);
					listaClientes.add(cliente);
					
					System.out.println("Cliente cadastrado com sucesso!");
					
					System.out.println("Pressione enter para continuar...");
					System.in.read();					
					break;
					
				case 2:
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
							cliente.getConta().Depositar(ler.nextDouble());
							
							System.out.println("Deposito realizado com sucesso!");
						} else {
							System.out.println("Cliente nao localizado.");
						}
						
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 3:
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
							
							if(cliente.getConta().getSaldo() <= 0) {
								System.out.println("Saldo insuficiente para realizar saques.");
								System.out.println("Pressione enter para continuar...");
								System.in.read();
								break;
							}
							
							System.out.println("Digite o valor do saque: R$ ");
							valorSaque = ler.nextDouble();
							
							if(valorSaque > cliente.getConta().getSaldo()) {
								System.out.println("Saldo insuficiente para realizar esse saque.");
								System.out.println("Pressione enter para continuar...");
								System.in.read();
								break;
							}else {
								cliente.getConta().Sacar(valorSaque);
								System.out.println("Saque realizado com sucesso!");
							}
							
						} else {
							System.out.println("Cliente nao localizado.");
						}
						
						System.out.println("Pressione enter para continuar...");
						System.in.read();
					break;
					
				case 4:
					if(listaClientes.size() < 2) {
						System.out.println("Quantidade insuficiente de clientes para realizar transferencias.");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					int exec = 0;
					
					do {
						System.out.printf(
								"+------+----------------------------------------+--------------+\n" +
								"|  ID  |                  Nome                  |    Saldo     |\n" +
								"+------+----------------------------------------+--------------+\n");
						for(Cliente c: listaClientes)
							System.out.printf(
									"| %-4d | %-38s | R$ %-9.2f |\n" +
									"+------+----------------------------------------+--------------+\n",
									c.getId(), c.getNome(), c.getConta().getSaldo());
						
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
									if(clienteOrigem.getConta().getSaldo() <= 0) {
										System.out.println("Saldo insuficiente para realizar transferencias.");
										System.out.println("Pressione enter para continuar...");
										System.in.read();
										break;
									}
								} else {
									clienteDestino = listaClientes.get(idCliente);
								}
								exec++;
							} else {
								System.out.println("ID invalida. Tente novamente.\n");
							}							
					}while(exec < 2);
					
					System.out.println("Digite o valor da transferencia: R$ ");
					valorTransferencia = ler.nextDouble();
					
					if(valorTransferencia > clienteOrigem.getConta().getSaldo()) {
						System.out.println("Saldo insuficiente para realizar transferencias.");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					clienteOrigem.getConta().Sacar(valorTransferencia);
					clienteDestino.getConta().Depositar(valorTransferencia);
					
					System.out.println("Transferencia realizada com sucesso!");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					
					break;
					
				case 5:
					System.exit(0);
					break;
					
				default:
					System.out.printf("\nOpcao invalida.\n");
					break;
			}
		}		
	}
}
