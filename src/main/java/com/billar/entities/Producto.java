package com.billar.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "productos")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String marca;
	private Integer cantidad;
	private BigDecimal precio;
	private LocalDate fechaCrea;
	private Boolean activo;

	public Producto() {
		super();
	}

	public Producto(Long id, String nombre, String marca, Integer cantidad, BigDecimal precio, LocalDate fechaCrea,
			Boolean activo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
		this.precio = precio;
		this.fechaCrea = fechaCrea;
		this.activo = activo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public LocalDate getFechaCrea() {
		return fechaCrea;
	}

	public void setFechaCrea(LocalDate fechaCrea) {
		this.fechaCrea = fechaCrea;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

}
