package br.com.houseflipping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imoveis")
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;

    private String endereco;

    private Integer numeroQuartos;

    private Integer numeroBanheiros;

    private Double area;

    private Double preco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getNumeroQuartos() {
		return numeroQuartos;
	}

	public void setNumeroQuartos(Integer numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}

	public Integer getNumeroBanheiros() {
		return numeroBanheiros;
	}

	public void setNumeroBanheiros(Integer numeroBanheiros) {
		this.numeroBanheiros = numeroBanheiros;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
}
