package ar.edu.unlp.info.oo1.ej3;

public class Item {
	String detalle;
	int cantidad;
	double costoUnitario;
	
	public Item (String det, int cant, double costoUni) {
		detalle = det;
		cantidad = cant;
		costoUnitario = costoUni;
	}	
	
	public double costo() {
		return this.cantidad * getCostoUnitario();
	}
	
	public double getCostoUnitario() {
		return costoUnitario;
	}
}
