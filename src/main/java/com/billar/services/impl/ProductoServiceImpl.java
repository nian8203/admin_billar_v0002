package com.billar.services.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.billar.entities.Producto;
import com.billar.repositories.IProductoRepository;
import com.billar.services.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {
	
	private final IProductoRepository productoRepository;
	
	public ProductoServiceImpl(IProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}

	@Override
	public Producto createProducto(Producto producto) {
		// TODO Auto-generated method stub
		producto.setFechaCrea(LocalDate.now());
		producto.setActivo(true);
		return productoRepository.save(producto);
	}

	@Override
	public Producto findByProductId(Long id) {
		// TODO Auto-generated method stub
		return productoRepository.findById(id).orElseThrow();
	}

	@Override
	public List<Producto> findAllProducts() {
		// TODO Auto-generated method stub
		return  productoRepository.findAll();
	}

	@Override
	public void deleteProduct(Long id) {
		// TODO Auto-generated method stub
		productoRepository.deleteById(id);
	}

}
