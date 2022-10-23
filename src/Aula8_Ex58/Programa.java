package Aula8_Ex58;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			Produto produto = new Produto();
			produto.setId((listaProdutos.size() > 0) ? listaProdutos.get(listaProdutos.size() - 1).getId() + 1 : 1);
			
			System.out.printf("Digite o nome do produto: ");
			produto.setNome(ler.next());
			
			System.out.printf("Digite o preco do produto: ");
			produto.setPreco(ler.nextDouble());
			
			System.out.printf("Digite a quantidade do produto: ");
			produto.setQuantidade(ler.nextDouble());
			
			System.out.printf("O produto possui categoria? [S/N]");
			if(ler.next().equalsIgnoreCase("s")) {
				Categoria categoria = new Categoria();
				
				System.out.printf("Informe a ID da categoria: ");
				categoria.setId(ler.nextInt());
				
				System.out.printf("Informe o nome da categoria: ");
				categoria.setNome(ler.next());
				produto.setCategoria(categoria);
			} else {
				produto.setCategoria(null);
			}
			System.out.println("================");
			
			listaProdutos.add(produto);
		}
		
		System.out.println("\nExibindo dados dos produtos cadastrados: ");
		
		for(Produto p: listaProdutos) {
			System.out.println("\n================");
			System.out.printf(
					  "ID: %d\n"
					+ "Nome: %s\n"
					+ "Preco: %.2f\n"
					+ "Quantidade: %.2f",
					p.getId(), 
					p.getNome(),
					p.getPreco(),
					p.getQuantidade()
					);
			if(p.getCategoria() != null)
				System.out.printf(
						  "\nID Categoria: %d"
						+ "\nNome Categoria: %s",
						p.getCategoria().getId(),
						p.getCategoria().getNome());
		}
		
	}

}