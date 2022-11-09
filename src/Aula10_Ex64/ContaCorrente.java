package Aula10_Ex64;

public class ContaCorrente extends Conta{
	private double limiteChequeEspecial;
	private Boolean cartaoCredito;
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(double limiteChequeEspecial, Boolean emergencial) { //Overload
		this.limiteChequeEspecial = limiteChequeEspecial * 1.5;
	}
	
	public Boolean getCartaoCredito() {
		return cartaoCredito;
	}
	
	public void setCartaoCredito(Boolean cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}
	
	public ContaCorrente() {
		
	}
	
	public ContaCorrente(String agencia, String numero, double saldo, double limiteChequeEspecial, Boolean cartaoCredito) {
		super(agencia, numero, saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.cartaoCredito = cartaoCredito;
	}
	
}