package com.projeto.pizzaria.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String username;
	private String password;
	private String nivel_usuario;
	
	@OneToMany(mappedBy="usuario")
	private List<Pedido> pedidos;
	
	public Usuario() {
		
	}

	public Usuario(int id, String nome, String username, String password, String nivel_usuario) {
		super();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
		this.nivel_usuario = nivel_usuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNivel_usuario() {
		return nivel_usuario;
	}

	public void setNivel_usuario(String nivel_usuario) {
		this.nivel_usuario = nivel_usuario;
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
		Usuario other = (Usuario) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", username=" + username + ", password=" + password
				+ ", nivel_usuario=" + nivel_usuario + "]";
	}
	
	
	
}
