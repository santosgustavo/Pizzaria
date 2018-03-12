package com.projeto.pizzaria.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.pizzaria.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
