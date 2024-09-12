package ar.edu.unlp.info.oo1.BalanzaMejorada;

import java.time.LocalDate;

public class Ticket extends Balanza{
	
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
	
	// ¿Qué cambios cree necesarios en Ticket para que pueda conocer a los productos? 
	// Que tickets extienda de balanza, asi podra conocer y uusar sus metodos
	// ¿Estos cambios modifican las responsabilidades ya asignadas de realizar cálculo del precio total?. ¿El ticket adquiere nuevas responsabilidades que antes no tenía?
	// no, por que lo realiza el producto. no se. 
	// CONSULTAR
}
