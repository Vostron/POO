package Aula8_Ex59;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	
	public String getAgencia() {
		return agencia;
	}
	
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	ContaBancaria(){
		
	}
	
	ContaBancaria(String agencia, String numero){
		this.agencia = agencia;
		this.numero = numero;
	}
	
	public void Depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void Sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}
	
	public void Transferir(double valorTransf, Cliente destinatario) {
		Sacar(valorTransf);
		destinatario.getConta().Depositar(valorTransf);
	}
	
	public double ConsultarSaldo() {
		return getSaldo();
	}
}
