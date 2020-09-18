package br.com.unicesumar.loja.domain;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class CarrinhoCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	@JoinTable( name = "carrinho_produto")
	@JoinColumn( name = "carrinho_id")
	private List<Produto> produtos;
	
	@Size(min = 1)
	@Column(name = "valor_total")
	private BigDecimal valor;

	
	public CarrinhoCompra() {}
	
	public CarrinhoCompra(List<Produto> produtos, BigDecimal valor) {
		this.produtos = produtos;
		this.valor = valor;
	}
	
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public BigDecimal getValor() {
		return valor;
	}
	
	public void adicionaProduto(Produto produto ){
		this.produtos.add(produto);
	}
	public List<Produto> getProdutos() {
		return Collections.unmodifiableList(produtos);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
}
