package Aula8_Ex60;

public class Cliente {
	private int id;
	private String nome;
	private int idade;
	private ContaBancaria conta;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public ContaBancaria getConta() {
		return conta;
	}
	
	public void setConta(ContaBancaria conta) {
		this.conta = conta;
	}
	
	Cliente(){
		
	}
	
	Cliente(int id, String nome, int idade, ContaBancaria conta){
		
	}
}
