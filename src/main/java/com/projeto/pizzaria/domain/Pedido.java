package com.projeto.pizzaria.domain;

import java.io.Serializable;

public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String observacao;
	private double valor;
	private String tipo_pagamento;
	
	public Pedido() {
		
	}

	public Pedido(int id, String observacao, double valor, String tipo_pagamento) {
		super();
		this.id = id;
		this.observacao = observacao;
		this.valor = valor;
		this.tipo_pagamento = tipo_pagamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo_pagamento() {
		return tipo_pagamento;
	}

	public void setTipo_pagamento(String tipo_pagamento) {
		this.tipo_pagamento = tipo_pagamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", observacao=" + observacao + ", valor=" + valor + ", tipo_pagamento="
				+ tipo_pagamento + "]";
	}
	
	

}
