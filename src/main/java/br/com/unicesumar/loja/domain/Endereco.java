package br.com.unicesumar.loja.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String logradouro;
	
	@NotBlank 
	private String bairro;
	
	@NotNull
	private Integer numero;
	
	@NotBlank
	private String cidade;
	
	@Enumerated(EnumType.STRING)
	@NotNull
	private Estado estado;
	
	
	
	
	
}
