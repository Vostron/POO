package Aula8_Ex61;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Programa {
	
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		ArrayList<Cliente> listaClientes = new ArrayList<>();
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		ArrayList<Pedido>  listaPedidos  = new ArrayList<>();
		Cliente cliente = null;
		Produto produto = null;
		Pedido  pedido  = null;
		
		/*for(int i = 1; i < 10; i++) {
			listaClientes.add(new Cliente((listaClientes.size() > 0) ? listaClientes.get(listaClientes.size() - 1).getId() + 1 : 1, "NomeDeTeste" + i, "teste" + i + "@teste.com"));
			listaProdutos.add(new Produto((listaProdutos.size() > 0) ? listaProdutos.get(listaProdutos.size() - 1).getId() + 1 : 1, "ProdutoDeTeste" + i, i*i*i, i*i*1000));
		}*/

		int opt, id, idCliente = -1, idProduto = -1;
		double qtdProduto, vlTotal;
		String ans;

		for(;;) {
			System.out.printf( "+----------------------------------------------+\n" +
								"|  _____                         _        _    |\n" +
								"| / _  / ___    /\\/\\   __ _ _ __| | _____| |_  |\n" +
								"| \\// / / _ \\  /    \\ / _` | '__| |/ / _ \\ __| |\n" +
								"|  / //\\  __/ / /\\/\\ \\ (_| | |  |   <  __/ |_  |\n" +
								"| /____/\\___| \\/    \\/\\__,_|_|  |_|\\_\\___|\\__| |\n" +
								"+----------------------------------------------+\n" +
								"Menu principal: \n" +
								"[01] - Cadastrar clientes\n" +
								"[02] - Atualizar clientes\n" +
								"[03] - Excluir clientes\n" +
								"[04] - Listar clientes\n" +
								"[05] - Cadastrar produtos\n" +
								"[06] - Atualizar produtos\n" +
								"[07] - Excluir produtos\n" +
								"[08] - Listar produtos\n" +
								"[09] - Criar um pedido\n" +
								"[10] - Listar pedidos realizados\n" +
								"[11] - Sair\n" +
								"Opcao escolhida: "
			);
			opt = ler.nextInt();
			switch(opt){
				case 1: //Cadastrar clientes
					cliente = new Cliente();					
					cliente.setId((listaClientes.size() > 0) ? listaClientes.get(listaClientes.size() - 1).getId() + 1 : 1);
					
					System.out.print("Digite o nome do cliente: ");
					cliente.setNome(ler.next());
					
					System.out.print("Digite o e-mail do cliente: ");
					cliente.setEmail(ler.next());
					
					listaClientes.add(cliente);
					
					System.out.printf("\nCliente adicionado com sucesso!\n\n");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 2: //Atualizar clientes
					if(listaClientes.isEmpty()) {
						System.out.printf("\nErro: Nao existem clientes cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"\n" +
							"+----------------------------------------------------------------------------------+\n" +
							"|                                Lista de Clientes                                 |\n" +
							"+----+------------------------------------------+----------------------------------+\n" +
							"| ID |                   Nome                   |              E-mail              |\n" +
							"+----+------------------------------------------+----------------------------------+\n");
					
					for(Cliente c: listaClientes) {
						System.out.printf(
								"| %-2d | %-40s | %-32s |\n" +
								"+----+------------------------------------------+----------------------------------+\n",
								c.getId(), c.getNome(), c.getEmail());
					}
					System.out.printf("\nDigite a ID do cliente que deseja atualizar: ");
					id = ler.nextInt();
					
					for(Cliente c: listaClientes) {
						if(c.getId() == id) {
							idCliente = listaClientes.indexOf(c);
							break;
						}
					}
					
					if(idCliente != -1) {
						cliente = listaClientes.get(idCliente);
						
						System.out.print("Digite o nome do cliente: ");
						cliente.setNome(ler.next());
						
						System.out.print("Digite o e-mail do cliente: ");
						cliente.setEmail(ler.next());
						
						System.out.printf("\nCliente atualizado com sucesso!\n");
					} else {
						System.out.printf("\nErro: Cliente nao localizado.\n");
					}					
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 3: //Excluir clientes
					if(listaClientes.isEmpty()) {
						System.out.printf("\nErro: Nao existem clientes cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"\n" +
							"+----------------------------------------------------------------------------------+\n" +
							"|                                Lista de Clientes                                 |\n" +
							"+----+------------------------------------------+----------------------------------+\n" +
							"| ID |                   Nome                   |              E-mail              |\n" +
							"+----+------------------------------------------+----------------------------------+\n");
					
					for(Cliente c: listaClientes) {
						System.out.printf(
								"| %-2d | %-40s | %-32s |\n" +
								"+----+------------------------------------------+----------------------------------+\n",
								c.getId(), c.getNome(), c.getEmail());
					}
					System.out.printf("\nDigite a ID do cliente que deseja atualizar: ");
					id = ler.nextInt();
					
					for(Cliente c: listaClientes) {
						if(c.getId() == id) {
							idCliente = listaClientes.indexOf(c);
							listaClientes.remove(c);
							break;
						}
					}
					
					if(idCliente != -1)
						System.out.printf("\nCliente excluido com sucesso!\n");
					else
						System.out.printf("\nErro: Cliente nao localizado.\n");
					
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 4: //Listar clientes
					if(listaClientes.isEmpty()) {
						System.out.printf("\nErro: Nao existem clientes cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"\n" +
							"+----------------------------------------------------------------------------------+\n" +
							"|                                Lista de Clientes                                 |\n" +
							"+----+------------------------------------------+----------------------------------+\n" +
							"| ID |                   Nome                   |              E-mail              |\n" +
							"+----+------------------------------------------+----------------------------------+\n");
					
					for(Cliente c: listaClientes) {
						System.out.printf(
								"| %-2d | %-40s | %-32s |\n" +
								"+----+------------------------------------------+----------------------------------+\n",
								c.getId(), c.getNome(), c.getEmail());
					}
					System.out.printf("\n");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 5: //Cadastrar produtos
					produto = new Produto();
					
					produto.setId((listaProdutos.size() > 0) ? listaProdutos.get(listaProdutos.size() - 1).getId() + 1 : 1);
					
					System.out.print("Digite o nome do produto: ");
					produto.setNome(ler.next());
					
					System.out.print("Digite o preco do produto: R$ ");
					produto.setPreco(ler.nextDouble());
					
					System.out.print("Digite a quantidade em estoque do produto: ");
					produto.setEstoque(ler.nextDouble());
					
					listaProdutos.add(produto);
					
					System.out.printf("\nProduto adicionado com sucesso!\n\n");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 6: //Atualizar produtos
					if(listaProdutos.isEmpty()) {
						System.out.printf("\nErro: Nao existem produtos cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"\n" +
							"+-----------------------------------------------------------------------------+\n" +
							"|                              Lista de Produtos                              |\n" +
							"+----+------------------------------------------+-----------------------------+\n" +
							"| ID |                   Nome                   |    Preco    |  QTD Estoque  |\n" +
							"+----+------------------------------------------+-------------+---------------+\n");
					
					for(Produto p: listaProdutos)
						System.out.printf(
								"| %-2d | %-40s | R$ %-8.2f | %-13.2f |\n" +
								"+----+------------------------------------------+-------------+---------------+\n",
								p.getId(), p.getNome(), p.getPreco(), p.getEstoque());
										
					System.out.printf("\nDigite a ID do produto que deseja atualizar: ");
					id = ler.nextInt();
					
					for(Produto p: listaProdutos) {
						if(p.getId() == id) {
							idProduto = listaProdutos.indexOf(p);
							break;
						}
					}
					
					if(idProduto != -1) {
						produto = listaProdutos.get(idProduto);
						
						System.out.print("Digite o nome do produto: ");
						produto.setNome(ler.next());
						
						System.out.print("Digite o preco do produto: R$ ");
						produto.setPreco(ler.nextDouble());
						
						System.out.print("Digite a quantidade em estoque do produto: ");
						produto.setEstoque(ler.nextDouble());
						
						System.out.printf("\nProduto atualizado com sucesso!\n\n");
					} else {
						System.out.printf("\nErro: Produto nao localizado.\n");
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 7: //Excluir produtos
					if(listaProdutos.isEmpty()) {
						System.out.printf("\nErro: Nao existem produtos cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					
					System.out.printf(
							"\n" +
							"+-----------------------------------------------------------------------------+\n" +
							"|                              Lista de Produtos                              |\n" +
							"+----+------------------------------------------+-----------------------------+\n" +
							"| ID |                   Nome                   |    Preco    |  QTD Estoque  |\n" +
							"+----+------------------------------------------+-------------+---------------+\n");
					
					for(Produto p: listaProdutos)
						System.out.printf(
								"| %-2d | %-40s | R$ %-8.2f | %-13.2f |\n" +
								"+----+------------------------------------------+-------------+---------------+\n",
								p.getId(), p.getNome(), p.getPreco(), p.getEstoque());
					
					System.out.printf("\nDigite a ID do produto que deseja excluir: ");
					id = ler.nextInt();
					
					for(Produto p: listaProdutos) {
						if(p.getId() == id) {
							idProduto = listaProdutos.indexOf(p);
							listaProdutos.remove(p);
							break;
						}
					}
					
					if(idProduto != -1)
						System.out.printf("\nProduto excluido com sucesso!\n");
					else
						System.out.printf("\nErro: Produto nao localizado.\n");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 8: //Listar produtos
					if(listaProdutos.isEmpty()) {
						System.out.printf("\nErro: Nao existem produtos cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						return;
					}
					
					System.out.printf(
							"\n" +
							"+-----------------------------------------------------------------------------+\n" +
							"|                              Lista de Produtos                              |\n" +
							"+----+------------------------------------------+-----------------------------+\n" +
							"| ID |                   Nome                   |    Preco    |  QTD Estoque  |\n" +
							"+----+------------------------------------------+-------------+---------------+\n");
					
					for(Produto p: listaProdutos)
						System.out.printf(
								"| %-2d | %-40s | R$ %-8.2f | %-13.2f |\n" +
								"+----+------------------------------------------+-------------+---------------+\n",
								p.getId(), p.getNome(), p.getPreco(), p.getEstoque());
					
					System.out.printf("\n");
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 9: //Criar um pedido
					if(listaClientes.isEmpty()) {
						System.out.printf("\nErro: Nao existem clientes cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					if(listaProdutos.isEmpty()) {
						System.out.printf("\nErro: Nao existem produtos cadastrados no momento.\n\n");
						System.out.println("Pressione enter para continuar...");
						System.in.read();
						break;
					}
					pedido = new Pedido();
					pedido.setId((listaPedidos.size() > 0) ? listaPedidos.get(listaPedidos.size() - 1).getId() + 1 : 1);
					ArrayList<ItemPedido> listaItemPedido = new ArrayList<>();
					vlTotal = 0;
					
					//Definição do cliente:
					do {
						idCliente = -1;
						System.out.printf(
								"\n" +
								"+----------------------------------------------------------------------------------+\n" +
								"|                                Lista de Clientes                                 |\n" +
								"+----+------------------------------------------+----------------------------------+\n" +
								"| ID |                   Nome                   |              E-mail              |\n" +
								"+----+------------------------------------------+----------------------------------+\n");
						
						for(Cliente c: listaClientes) {
							System.out.printf(
									"| %-2d | %-40s | %-32s |\n" +
									"+----+------------------------------------------+----------------------------------+\n",
									c.getId(), c.getNome(), c.getEmail());
						}
						System.out.print("\nDigite a ID do cliente dono do pedido: ");
						id = ler.nextInt();
				
						for(Cliente c: listaClientes) {
							if(c.getId() == id) {
								idCliente = listaClientes.indexOf(c);
								break;
							}
						}
				
						if(idCliente == -1) {
							System.out.printf("\nErro: Cliente nao localizado.\n");
							System.out.println("Pressione enter para continuar...");
							System.in.read();
						} else {
							cliente = listaClientes.get(idCliente);
						}
					}while(idCliente == -1);					
					pedido.setCliente(cliente);
					
					//Definição de produto(s)
					for(;;) {
						idProduto = -1;
						System.out.printf(
								"\n" +
								"+-----------------------------------------------------------------------------+\n" +
								"|                              Lista de Produtos                              |\n" +
								"+----+------------------------------------------+-----------------------------+\n" +
								"| ID |                   Nome                   |    Preco    |  QTD Estoque  |\n" +
								"+----+------------------------------------------+-------------+---------------+\n");
						
						for(Produto p: listaProdutos)
							System.out.printf(
									"| %-2d | %-40s | R$ %-8.2f | %-13.2f |\n" +
									"+----+------------------------------------------+-------------+---------------+\n",
									p.getId(), p.getNome(), p.getPreco(), p.getEstoque());
						System.out.print("\nDigite a ID do produto desejado ou -1 para seguir: ");
						id = ler.nextInt();
						
						if(id == -1) {
							if(listaItemPedido.isEmpty()) {
								System.out.print("\nErro: Voce precisa selecionar ao menos um produto.\n");
								System.out.println("Pressione enter para continuar...");
								System.in.read();
								continue;
							}
							break;
						}
						
						for(Produto p: listaProdutos) {
							if(p.getId() == id) {
								idProduto = listaProdutos.indexOf(p);
								break;
							}
						}
						
						if(idProduto == -1) {
							System.out.print("\nErro: Produto nao localizado.\n");
							System.out.println("Pressione enter para continuar...");
							System.in.read();
							continue;
						} else {
							produto = listaProdutos.get(idProduto);
							if(produto.getEstoque() == 0.0) {
								System.out.print("\nErro: Nao ha estoque do produto selecionado.\n");
								System.out.println("Pressione enter para continuar...");
								System.in.read();
								continue;
							}
						}
						
						do {
							System.out.print("Digite a quantidade desejada do produto [MAX " + produto.getEstoque() + "]: ");
							qtdProduto = ler.nextDouble();
							
							if(qtdProduto > produto.getEstoque())
								System.out.print("\nErro: Quantidade selecionada maior do que estoque.\n");
							
						}while(qtdProduto > produto.getEstoque());
						
						listaItemPedido.add(new ItemPedido((listaItemPedido.size() > 0) ? listaItemPedido.get(listaItemPedido.size() - 1).getId() + 1 : 1, produto, qtdProduto));
						produto.setEstoque((produto.getEstoque() - qtdProduto));
					}
					pedido.setListaProdutos(listaItemPedido);
					
					System.out.printf(
							"\n\n" +
							"+-----------------------------------------------------------------------------+\n" +
							"|                              Resumo do Pedido                               |\n" +
							"+-----------------------------------------------------------------------------+\n" +
							"| Cliente: %-66s |\n" +
							"| E-mail:  %-66s |\n" +
							"+-----------------------------------------------------------------------------+\n" +
							"|                                   Produtos                                  |\n" +
							"+------------------------------------------+------------------+---------------+\n" +
							"|                 Nome                     |  Preco Unitario  |  Quantidade   |\n" +
							"+------------------------------------------+------------------+---------------+\n",
							cliente.getNome(), cliente.getEmail());
					
					for(ItemPedido ip: listaItemPedido) {
						System.out.printf(
								"| %-40s | R$ %-13.2f | %-13.2f |\n"+
								"+------------------------------------------+------------------+---------------+\n",
								ip.getProduto().getNome(), ip.getProduto().getPreco(), ip.getQuantidade());
						vlTotal += (ip.getProduto().getPreco() * ip.getQuantidade());
					}
					
					System.out.printf(
							"| Valor total do pedido: R$ %-49.2f |\n" +
							"+-----------------------------------------------------------------------------+\n",
							vlTotal);
					
					for(;;) {
						System.out.print("Finalizar pedido? [S/N] ");
						ans = ler.next();
						
						if(ans.toLowerCase().contentEquals("s")){
							listaPedidos.add(pedido);
							System.out.print("\nPedido finalizado com sucesso!\n");
							break;
						} else {
							for(ItemPedido ip: listaItemPedido)
								ip.getProduto().setEstoque( ip.getProduto().getEstoque() + ip.getQuantidade());
							System.out.print("\nPedido cancelado.\n");
							break;
						}
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 10: //Listar pedidos realizados
					vlTotal = 0;
					System.out.printf(
							"+-----------------------------------------------------------------------------+\n" +
							"|                              Lista de Pedidos                               |\n" +
							"+-----------------------------------------------------------------------------+\n");
					for(Pedido p: listaPedidos) {
						System.out.printf(
								"\n" +
								"+-----------------------------------------------------------------------------+\n" +
								"|                           Resumo do Pedido #%-3d                             |\n" +
								"+-----------------------------------------------------------------------------+\n" +
								"| Cliente: %-66s |\n" +
								"| E-mail:  %-66s |\n" +
								"+-----------------------------------------------------------------------------+\n" +
								"|                                   Produtos                                  |\n" +
								"+------------------------------------------+------------------+---------------+\n" +
								"|                 Nome                     |  Preco Unitario  |  Quantidade   |\n" +
								"+------------------------------------------+------------------+---------------+\n",
								p.getId(), p.getCliente().getNome(), p.getCliente().getEmail());
						
						for(ItemPedido ip: p.getListaProdutos()) {
							vlTotal += (ip.getProduto().getPreco() * ip.getQuantidade());
							System.out.printf(
									"| %-40s | R$ %-13.2f | %-13.2f |\n"+
									"+------------------------------------------+------------------+---------------+\n",
									ip.getProduto().getNome(), ip.getProduto().getPreco(), ip.getQuantidade());
						}
						System.out.printf(
								"| Valor total do pedido: R$ %-49.2f |\n" +
								"+-----------------------------------------------------------------------------+\n",
								vlTotal);
					}
					System.out.println("Pressione enter para continuar...");
					System.in.read();
					break;
					
				case 11:
					System.exit(0);
					break;
					
				default:
					System.out.println("Opcao invalida.");
					break;
			}
		}
	}
}
