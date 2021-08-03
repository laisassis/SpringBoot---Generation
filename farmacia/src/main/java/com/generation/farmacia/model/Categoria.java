package com.generation.farmacia.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class Categoria {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		
		@NotNull(message = "O atributo descrição é Obrigatório!")
		@Size(min = 5, max = 100)
		private String nomecategoria;
		
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("categoria")
		private List<Produto> produto;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNomecategoria() {
			return nomecategoria;
		}

		public void setNomecategoria(String nomecategoria) {
			this.nomecategoria = nomecategoria;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}

		
	
}
