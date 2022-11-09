package Aula10_Ex64;

import java.io.IOException;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int opt;
		for(;;) {
			System.out.printf(
					"+-----------------------------------+\n" +
					"|   _____ ____  _____               |\n" +
					"|  |_   _|  _ \\|  __ \\              |\n" +
					"|    | | | |_) | |  | | _____   __  |\n" +
					"|    | | |  _ <| |  | |/ _ \\ \\ / /  |\n" +
					"|   _| |_| |_) | |__| |  __/\\ V /   |\n" +
					"|  |_____|____/|_____/ \\___| \\_/    |\n" +
					"|                                   |\n" +
					"+-----------------------------------+\n" +
					"Escolha a opcao desejada: \n" +
					"[1] - Cadastrar Conta Corrente\n" +
					"[2] - Cadastrar Conta Poupanca\n" +
					"[3] - Cadastrar Conta Salario\n" +
					"[4] - Sair\n" +
					"Opcao escolhida: ");
			opt = ler.nextInt();
			
			switch(opt) {
				case 1:
					ContaCorrente cc = new ContaCorrente();
					
					System.out.print("Digite a agencia: ");
					cc.setAgencia(ler.next());
					
					System.out.print("Digite o numero da conta: ");
					cc.setNumero(ler.next());
					
					System.out.print("Digite o saldo: R$ ");
					cc.setSaldo(ler.nextDouble());
					
					System.out.print("O cliente deseja cartao de credito? [S/N] ");
					if(ler.next().equalsIgnoreCase("s"))
						cc.setCartaoCredito(true);
					else
						cc.setCartaoCredito(false);
					
					System.out.print("Digite o limite do cheque especial: R$ ");
					cc.setLimiteChequeEspecial(ler.nextDouble());
					
					System.out.printf(
							"\n\n" +
							"+---------------------------------+\n" +
							"|        Dados Cadastrados        |\n" +
							"+---------------------------------+\n" +
							"| Agencia:            %-11s |\n" +
							"| Conta:              %-11s |\n" +
							"| Saldo:              R$ %-8.2f |\n" +
							"| Cheque Especial:    R$ %-8.2f |\n" +
							"| Cartao de Credito:  %-11s |\n" +
							"+---------------------------------+\n",
							cc.getAgencia(), cc.getNumero(), cc.getSaldo(), cc.getLimiteChequeEspecial(),
							(cc.getCartaoCredito() == true) ? "Sim" : "Nao");
					
					System.out.print("\nPressione enter para continuar...\n");
					System.in.read();
					break;
					
				case 2:
					ContaPoupanca cp = new ContaPoupanca();
					
					System.out.print("Digite a agencia: ");
					cp.setAgencia(ler.next());
					
					System.out.print("Digite o numero da conta: ");
					cp.setNumero(ler.next());
					
					System.out.print("Digite o saldo: R$ ");
					cp.setSaldo(ler.nextDouble());
					
					System.out.print("Digite o rendimento (%): ");
					cp.setRendimento(ler.nextDouble());
					
					System.out.printf(
							"\n\n" +
							"+---------------------------------+\n" +
							"|        Dados Cadastrados        |\n" +
							"+---------------------------------+\n" +
							"| Agencia:            %-11s |\n" +
							"| Conta:              %-11s |\n" +
							"| Saldo:              R$ %-8.2f |\n" +
							"| Rendimento:         %-8.2f%% |\n"+
							"+---------------------------------+\n",
							cp.getAgencia(), cp.getNumero(), cp.getSaldo(), cp.getRendimento());
					
					System.out.print("\nPressione enter para continuar...\n");
					System.in.read();
					break;
					
				case 3:
					ContaSalario cs = new ContaSalario();
					
					System.out.print("Digite a agencia: ");
					cs.setAgencia(ler.next());
					
					System.out.print("Digite o numero da conta: ");
					cs.setNumero(ler.next());
					
					System.out.print("Digite o saldo: R$ ");
					cs.setSaldo(ler.nextDouble());
					
					System.out.print("Digite o CNPJ da empresa: ");
					cs.setCnpjEmpresa(ler.next());
					
					System.out.printf(
							"+---------------------------------+\n" +
							"|        Dados Cadastrados        |\n" +
							"+---------------------------------+\n" +
							"| Agencia:        %-15s |\n" +
							"| Conta:          %-15s |\n" +
							"| Saldo:          R$ %-12.2f |\n" +
							"| CNPJ:           %-15s |\n"+
							"+---------------------------------+\n",
							cs.getAgencia(), cs.getNumero(), cs.getSaldo(), cs.getCnpjEmpresa());
					
					System.out.print("\nPressione enter para continuar...\n");
					System.in.read();
					break;
					
				case 4:
					System.exit(0);
					break;
			}
		}
	}
}