package com.generation.farmacia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "O atributo nome é Obrigatório!")
	@Size(min = 5, max = 100)
	private String nomeproduto;
	
	@NotNull(message = "O atributo valor do produto é Obrigatório!")
	private double valorproduto;
	
	@NotNull(message = "O atributo descrição do produto é Obrigatório!")
	@Size(min = 5, max = 500)
	private String descricaoproduto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeproduto() {
		return nomeproduto;
	}

	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}

	public double getValorproduto() {
		return valorproduto;
	}

	public void setValorproduto(double valorproduto) {
		this.valorproduto = valorproduto;
	}

	public String getDescricaoproduto() {
		return descricaoproduto;
	}

	public void setDescricaoproduto(String descricaoproduto) {
		this.descricaoproduto = descricaoproduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

	
	

}
