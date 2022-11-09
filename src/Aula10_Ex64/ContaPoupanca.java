package Aula10_Ex64;

public class ContaPoupanca extends Conta{
	private double rendimento;

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	ContaPoupanca(){
		
	}
	
	ContaPoupanca(String agencia, String numero, double saldo, double rendimento){
		super(agencia, numero, saldo);
		this.rendimento = rendimento;
	}
	
	public void Sacar(double valor) {	//Override
		super.Sacar(valor);
		this.setSaldo(this.getSaldo() + (valor * 0.1));
	}
}