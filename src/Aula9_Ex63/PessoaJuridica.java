package Aula9_Ex63;

public class PessoaJuridica extends Pessoa{
	private String CNPJ;

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	
	PessoaJuridica(){
		
	}
	
	PessoaJuridica(int id, String nome, String email, String CNPJ){
		super(id, nome, email);
		this.CNPJ = CNPJ;
	}
}
