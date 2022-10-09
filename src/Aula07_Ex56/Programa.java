package Aula07_Ex56;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Produto[] listaProdutos = new Produto[5];
		
		for(int i = 0; i < 5; i++) {
			listaProdutos[i] = new Produto();
			listaProdutos[i].setId(i);
			
			System.out.printf("Digite o nome do produto: ");
			String pNome = ler.next();
			listaProdutos[i].setNome(pNome);
			
			System.out.printf("Digite o preco do produto: ");
			double preco = ler.nextDouble();
			listaProdutos[i].setPreco(preco);
			
			System.out.printf("Digite a quantidade do produto: ");
			double quantidade = ler.nextDouble();
			listaProdutos[i].setQuantidade(quantidade);
			
			System.out.printf("O produto possui categoria? [S/N]");
			if(ler.next().equalsIgnoreCase("s")) {
				Categoria categoria = new Categoria();
				
				System.out.printf("Informe a ID da categoria: ");
				int id = ler.nextInt();
				categoria.setId(id);
				
				System.out.printf("Informe o nome da categoria: ");
				String cNome = ler.next();
				categoria.setNome(cNome);
				listaProdutos[i].setCategoria(categoria);
			}
			System.out.println("================");
		}
		
		System.out.println("\nExibindo dados dos produtos cadastrados: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("\n================");
			System.out.printf(
					  "ID: %d\n"
					+ "Nome: %s\n"
					+ "Preco: %.2f\n"
					+ "Quantidade: %.2f",
					listaProdutos[i].getId(), 
					listaProdutos[i].getNome(),
					listaProdutos[i].getPreco(),
					listaProdutos[i].getQuantidade()
					);
			if(listaProdutos[i].getCategoria() != null)
				System.out.printf(
						  "\nID Categoria: %d"
						+ "\nNome Categoria: %s",
						listaProdutos[i].getCategoria().getId(),
						listaProdutos[i].getCategoria().getNome());
		}
		
	}

}
