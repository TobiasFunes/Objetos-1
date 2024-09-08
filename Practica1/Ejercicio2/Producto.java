package ar.edu.info.unlp.balanzaElectronica;

public class Producto {
	
	double peso;
	double precioPorKilo;
	String descripcion;
	
	public double getPrecio() {
		return precioPorKilo * peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}
	public double getPrecioPorKilo() {
		return precioPorKilo;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPeso() {
		return peso;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
}
