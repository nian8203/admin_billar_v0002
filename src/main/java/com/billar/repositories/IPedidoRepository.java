package com.billar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billar.entities.Pedido;

public interface IPedidoRepository extends JpaRepository<Pedido, Long> {

}
