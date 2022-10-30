package Aula8_Ex60;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ContaBancaria {
	private String agencia;
	private String numero;
	private double saldo;
	private ArrayList<String> extrato;
	private double limite;
	
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

	public ArrayList<String> getExtrato() {
		return extrato;
	}

	public void setExtrato(ArrayList<String> extrato) {
		this.extrato = extrato;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	ContaBancaria(){
		this.extrato = new ArrayList<>();
		this.limite = 75.0;
		this.agencia = "4422";
	}
	
	ContaBancaria(String agencia, String numero){
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
	
	public void Depositar(double valorDeposito, Boolean transferencia) {
		if(this.limite < 75) {
			this.limite += valorDeposito;
			if(this.limite > 75) {
				this.saldo += (this.limite - 75);
				this.limite = 75.0;
			}
				
		} else {
			this.saldo += valorDeposito;
		}
		
		if(!transferencia) {
			Date date = new Date();
			String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
			this.extrato.add("[" + dataHora + "] Deposito: R$ " + valorDeposito);
		}
	}
	
	public Boolean Sacar(double valorSaque, Boolean transferencia) {
		double aux;
		if((this.limite + this.saldo) >= valorSaque) {
			aux = this.saldo - valorSaque;
			if(aux < 0) {
				this.saldo = 0;
				this.limite += aux;
			} else {
				this.saldo -= valorSaque;
			}
			
			if(!transferencia) {
				Date date = new Date();
				String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
				this.extrato.add("[" + dataHora + "] Saque: R$ " + valorSaque);
			}
			return true;
		}
		return false;
	}
	
	public void Transferir(double valorTransf, Cliente origem, Cliente destinatario) {
		Date date = new Date();
		String dataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(date);
		Sacar(valorTransf, true);
		this.extrato.add("[" + dataHora + "] Transferencia realizada: R$ " + valorTransf + " para " + destinatario.getNome());
		
		destinatario.getConta().Depositar(valorTransf, true);
		destinatario.getConta().extrato.add("[" + dataHora + "] Transferencia recebida: R$ " + valorTransf + " Origem: " + origem.getNome());
	}
	
	public double ConsultarSaldo() {
		return this.getSaldo();
	}
	
	public String ConsultarExtrato() {
		String extrato = "";
		
		for(String movimentacao: this.extrato)
			extrato += movimentacao + "\n";
		
		return extrato;
	}

	
}
