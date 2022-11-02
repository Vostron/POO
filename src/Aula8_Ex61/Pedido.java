package Aula8_Ex61;

import java.util.ArrayList;

public class Pedido {
	private int id;
	private Cliente cliente;
	private ArrayList<ItemPedido> listaProdutos;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public ArrayList<ItemPedido> getListaProdutos() {
		return listaProdutos;
	}
	
	public void setListaProdutos(ArrayList<ItemPedido> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	Pedido(){
		
	}
	
	Pedido(int id, Cliente cliente, ArrayList<ItemPedido> listaProdutos){
		this.id = id;
		this.cliente = cliente;
		this.listaProdutos = listaProdutos;
	}
}
