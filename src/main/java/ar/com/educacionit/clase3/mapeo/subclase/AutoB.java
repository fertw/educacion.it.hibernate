package ar.com.educacionit.clase3.mapeo.subclase;

import jakarta.persistence.Entity;

@Entity
public class AutoB extends VehiculoB {
	private int cantidadDePuertas;

	public AutoB() {
	}
	
	public AutoB(String fabricante, int cantidadDePuertas) {
		super(fabricante);
		this.cantidadDePuertas = cantidadDePuertas;
	}
	
	public int getCantidadDePuertas() {
		return cantidadDePuertas;
	}
	
	public void setCantidadDePuertas(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}
	
	

}
