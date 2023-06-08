package com.billar.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billar.entities.Producto;
import com.billar.services.impl.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {
	
	private final ProductoServiceImpl productoServiceImpl;
	
	public ProductoController(ProductoServiceImpl productoServiceImpl) {
		this.productoServiceImpl = productoServiceImpl;
	}
	
	@PostMapping("/producto")
	public ResponseEntity<Producto> create(@RequestBody Producto producto){
		Producto newProducto =  productoServiceImpl.createProducto(producto);
		return ResponseEntity.status(HttpStatus.CREATED).body(newProducto);
//		return ResponseEntity.ok(newProducto);
	}
	
	@GetMapping("/producto")
	public ResponseEntity<List<Producto>> getProducts(){
		List<Producto> productos = productoServiceImpl.findAllProducts();
		return ResponseEntity.ok(productos);
	}
	
	@GetMapping("/producto/{id}")
	public ResponseEntity<?> findById(@PathVariable Long id){
		Producto producto = productoServiceImpl.findByProductId(id);
		return ResponseEntity.ok(producto);
	}

	@DeleteMapping("/producto/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		productoServiceImpl.deleteProduct(id);
		return ResponseEntity.noContent().build();
	}

}
