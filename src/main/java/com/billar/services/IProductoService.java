package com.billar.services;

import java.util.List;

import com.billar.entities.Producto;

public interface IProductoService {

	public Producto createProducto(Producto producto);
	public Producto findByProductId(Long id);
	public List<Producto> findAllProducts();
	public void deleteProduct(Long id);
	
}
