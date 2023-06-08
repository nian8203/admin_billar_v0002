package com.billar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billar.entities.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long> {

}
