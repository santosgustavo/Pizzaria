package com.projeto.pizzaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.pizzaria.domain.Cliente;
import com.projeto.pizzaria.repositories.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente buscarId(Integer id) {

		Cliente obj = repo.findOne(id);

		return obj;
	}
}
