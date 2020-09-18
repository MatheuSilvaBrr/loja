package br.com.unicesumar.loja.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;


@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@Column(name = "cliente_id")
	private Cliente cliente;
	
	@OneToOne
	@Column(name = "carrinho_id")
	private CarrinhoCompra carrinhoCompra;

	public Pedido(Cliente cliente, CarrinhoCompra carrinhoCompra) {
		this.cliente = cliente;
		this.carrinhoCompra = carrinhoCompra;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public CarrinhoCompra getCarrinhoCompra() {
		return carrinhoCompra;
	}

	public void setCarrinhoCompra(CarrinhoCompra carrinhoCompra) {
		this.carrinhoCompra = carrinhoCompra;
	}
	
	
	
	
}
