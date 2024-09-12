package ar.edu.unlp.info.oo1.BalanzaMejorada;

import java.util.*;

public class Balanza {

	int cantidadDeProductos;
	double precioTotal;
	double pesoTotal;
	List<Producto> lista = new LinkedList<Producto>();
	
	public void ponerEnCero() {
		cantidadDeProductos = 0;
		precioTotal = 0;
		pesoTotal = 0;
		lista = new LinkedList<Producto>();
	}
	public void agregarProducto(Producto prod) {
		cantidadDeProductos += 1;
		precioTotal += prod.getPrecio();
		pesoTotal += prod.getPeso();
		lista.add(prod);
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

	public List<Producto> getProductos(){
		return lista;
	}
				
	//¿Qué cambio produce este nuevo requerimiento en en la implementación del mensaje ponerEnCero() ? 
	// el cambio que produce es que ahora ponerEnCero() inicializa la lista

	// ¿Es necesario, ahora, almacenar los totales en la balanza? ¿Se pueden obtener estos valores de otra forma?
	// no, ya que esa informacion se pueden conseguir con la lista
}
