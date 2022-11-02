package Aula9_Ex62;

public class ContaSalario extends Conta{
	private String cnpjEmpresa;

	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}

	public void setCnpjEmpresa(String cnpjEmpresa) {
		this.cnpjEmpresa = cnpjEmpresa;
	}

	ContaSalario(){
		
	}
	
	ContaSalario(String agencia, String numero, double saldo, String cnpjEmpresa){
		super(agencia, numero, saldo);
		this.cnpjEmpresa = cnpjEmpresa;
	}
}
