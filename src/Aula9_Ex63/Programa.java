package Aula9_Ex63;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);		
		ArrayList<Pessoa> listaPessoas = new ArrayList<>();
		PessoaFisica pf = null;
		PessoaJuridica pj = null;
		int opt;
		
		do {
			System.out.printf(
					"Escolha uma opcao\n" +
					"[1] - Cadastrar pessoa física\n" +
					"[2] - Cadastrar pessoa juridica\n" +
					"[3] - Exibir pessoas cadastradas\n" +
					"[4] - Sair\n" +
					"Opcao escolhida: ");
			opt = ler.nextInt();
			
			switch(opt) {
				case 1:
					pf = new PessoaFisica();
					pf.setId((listaPessoas.size() > 0) ? listaPessoas.get(listaPessoas.size() - 1).getId() + 1 : 1);
					
					System.out.print("Digite o nome da pessoa: ");
					pf.setNome(ler.next());
					
					System.out.print("Digite o email da pessoa: ");
					pf.setEmail(ler.next());
					
					System.out.print("Digite o CPF: ");
					pf.setCPF(ler.next());
					
					listaPessoas.add(pf);
					System.out.printf("Pessoa fisica adicionada com sucesso!\nPressione enter para continuar..");
					System.in.read();
					break;
				case 2:
					pj = new PessoaJuridica();
					pj.setId((listaPessoas.size() > 0) ? listaPessoas.get(listaPessoas.size() - 1).getId() + 1 : 1);
					
					System.out.print("Digite o nome da pessoa: ");
					pj.setNome(ler.next());
					
					System.out.print("Digite o email da pessoa: ");
					pj.setEmail(ler.next());
					
					System.out.print("Digite o CNPJ: ");
					pj.setCNPJ(ler.next());
					
					listaPessoas.add(pj);
					System.out.printf("Pessoa juridica adicionada com sucesso!\nPressione enter para continuar..");
					System.in.read();
					break;
				case 3:
					for(Pessoa p: listaPessoas) {
						if(p instanceof PessoaFisica)
							System.out.print("Pessoa Fisica: ");
						else
							System.out.print("Pessoa Juridica: ");
						
						System.out.println("ID: " + p.getId());
						System.out.println("Nome: " + p.getNome());
						System.out.println("Email: " + p.getEmail());
						
						if(p instanceof PessoaFisica) {
							pf = (PessoaFisica) p;
							System.out.println("CPF: " + pf.getCPF());
						}else {
							pj = (PessoaJuridica) p;
							System.out.println("CNPJ: " + pj.getCNPJ());
						}
					}
					break;
				case 4:
					System.exit(0);
					break;
				default:
					System.out.print("\nOpcao invalida.\nPressione enter para continuar..");
					System.in.read();
			}
		}while(true);
	}

}
