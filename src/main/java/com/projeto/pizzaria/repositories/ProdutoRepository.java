package com.projeto.pizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pizzaria.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
