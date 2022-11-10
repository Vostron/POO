package Aula10_Ex65;

public class PessoaFisica extends Pessoa{
	private String CPF;
	private String RG;
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	PessoaFisica() {
		super();
	}
	
	PessoaFisica(int id, String nome, String email, String CPF){
		super(id, nome, email);
		this.CPF = CPF;
	}
	
	PessoaFisica(int id, String nome, String email, String CPF, String RG){	//Overload
		super(id, nome, email);
		this.CPF = CPF;
		this.setRG(RG);
	}
}