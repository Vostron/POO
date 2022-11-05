package Aula9_Ex63;

public class PessoaFisica extends Pessoa{
	private String CPF;
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	PessoaFisica() {
		super();
	}
	
	PessoaFisica(int id, String nome, String email, String CPF){
		super(id, nome, email);
		this.CPF = CPF;
	}
}
