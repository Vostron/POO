package Aula9_Ex62;

public class ContaCorrente extends Conta{
	private double limiteChequeEspecial;
	private Boolean cartaoCredito;
	
	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}
	
	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
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
