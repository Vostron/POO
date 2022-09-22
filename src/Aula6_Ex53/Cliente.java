package Aula6_Ex53;

public class Cliente {
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria conta;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	
	public String exibirNomeIdade() {
		String dadosCliente = "Nome: " + this.nome +
				"\nIdade: " + this.idade;
		return dadosCliente;
	}
	
	public String exibirDadosConta() {
		String dadosConta = "Agencia: " + this.conta.agencia +
				"\nNumero: " + this.conta.numero + 
				"\nSaldo: " + this.conta.saldo;
		return dadosConta;		
	}
}
