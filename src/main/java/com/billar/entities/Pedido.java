package com.billar.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "pedidos")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate horaInicio;
	private LocalDate horaFin;
	private BigDecimal total;

	@ManyToOne(fetch = FetchType.LAZY) // muchos productos a un pedido
	@JoinColumn(name = "producto_id") // crear FK, si no se pone el la crea automaticamente
	@JsonIgnoreProperties({ "hibernateazyInitializer", "handler" }) // evita errores al lanzar la app
	private Producto producto;

	public Pedido() {
		super();
	}

	public Pedido(Long id, LocalDate horaInicio, LocalDate horaFin, BigDecimal total, Producto producto) {
		super();
		this.id = id;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.total = total;
		this.producto = producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalDate horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalDate getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalDate horaFin) {
		this.horaFin = horaFin;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
