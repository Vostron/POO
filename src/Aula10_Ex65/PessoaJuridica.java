package Aula10_Ex65;

public class PessoaJuridica extends Pessoa{
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	public String getNome() {	//Override
		return (super.getNome() + ":" + this.getCNPJ());
	}
	
	PessoaJuridica(){
		
	}
	
	PessoaJuridica(int id, String nome, String email, String CNPJ){
		super(id, nome, email);
		this.CNPJ = CNPJ;
	}
}