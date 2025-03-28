package cafeteria.vendas;

import java.time.LocalDateTime;

import cafeteria.vendas.clientes.Cliente;

public class Venda {
	private int id;
	private LocalDateTime dataHora;
	private Cliente cliente;
	private ItemVenda[] itens;
	private double desconto;
	private double valorTotal;
	
	
	
	public Venda(int id, LocalDateTime dataHora, Cliente cliente, ItemVenda[] itens, double desconto,
			double valorTotal) {
		super();
		this.id = id;
		this.dataHora = dataHora;
		this.cliente = cliente;
		this.itens = itens;
		this.desconto = desconto;
		this.valorTotal = valorTotal;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalDateTime getDataHora() {
		return dataHora;
	}



	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public ItemVenda[] getItens() {
		return itens;
	}



	public void setItens(ItemVenda[] itens) {
		this.itens = itens;
	}



	public double getDesconto() {
		return desconto;
	}



	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}



	public double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	
}
