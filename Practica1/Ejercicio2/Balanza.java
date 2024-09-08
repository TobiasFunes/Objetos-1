package ar.edu.info.unlp.balanzaElectronica;

public class Balanza {

	int cantidadDeProductos;
	double precioTotal;
	double pesoTotal;
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
	}
	public void agregarProducto(Producto prod) {
		cantidadDeProductos += 1;
		precioTotal += prod.getPrecio();
		pesoTotal += prod.getPeso();
	}
	
	public Ticket emitirTicket() {
		Ticket tic = new Ticket(this.getCantidadDeProductos(), this.getPrecioTotal(), this.getPesoTotal());
		return tic;
	}
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	public double getPrecioTotal() {
		return precioTotal;
	}
	public double getPesoTotal() {
		return pesoTotal;
	}
	
}
