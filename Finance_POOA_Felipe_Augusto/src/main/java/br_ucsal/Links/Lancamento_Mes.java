package br_ucsal.Links;

import java.math.BigDecimal;

public class Lancamento_Mes {
	
	public static final String DESPESA = "DESPESA"; 
	public static final String RECEITA = "RECEITA"; 
	
	private String tipo;
	private BigDecimal valor;
	private String descricao;




	public Lancamento_Mes(String tipo, BigDecimal valor, String descricao) {
		super();
		this.tipo = tipo;
		this.valor = valor;
		this.descricao = descricao;
	}


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}




}
