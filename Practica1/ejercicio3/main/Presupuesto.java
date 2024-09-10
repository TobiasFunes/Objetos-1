package ar.edu.unlp.info.oo1.ej3;

import java.time.LocalDate;
import java.util.*;

public class Presupuesto {
	LocalDate fecha;
	String cliente;
	private List<Item> items;
	
	public Presupuesto() {
		 this.fecha = LocalDate.now();
		 this.items = new ArrayList<Item>();
	}
	public Presupuesto(String cli) {
		this.cliente = cli;
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	public void agregarItem (Item item) {
		items.add(item);
	}
	
	public double calcularTotal() {
		double cantAux = 0;
		Iterator<Item> it = items.iterator();
		while (it.hasNext()) {
			cantAux += it.next().costo();
		}
		return cantAux;
	}
	public String getCliente() {
		return this.cliente;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
}
