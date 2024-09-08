package ar.edu.info.unlp.balanzaElectronica;

import java.time.LocalDate;

public class Ticket {
	
	LocalDate fecha;
	int cantidadDeProductos;
	double pesoTotal;
	double precioTotal;
	
	public Ticket (int cant, double precio, double peso) {
		cantidadDeProductos = cant;
		precioTotal = precio;
		pesoTotal = peso;
		fecha = LocalDate.now();
	}
	public double impuesto() {
		return (this.getPrecioTotal() * 0.21);
	}
	
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}
	public LocalDate getFecha() {
		return fecha;
	}

	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}
	
}
