package br.ucsal.pooa.finance.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Lancamento {
	
	public static final String DESPESA = "DESPESA";
	public static final String RECEITA = "RECEITA";
	
	private String tipo;
	private BigDecimal valor;
	private String descricao;
	
	public Lancamento(String tipo, BigDecimal valor, String descricao) {
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lancamento [tipo=");
		builder.append(tipo);
		builder.append(", valor=");
		builder.append(valor);
		builder.append(", descricao=");
		builder.append(descricao);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(descricao, tipo, valor);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lancamento other = (Lancamento) obj;
		return Objects.equals(descricao, other.descricao) && Objects.equals(tipo, other.tipo)
				&& Objects.equals(valor, other.valor);
	}

	

	
	
}
