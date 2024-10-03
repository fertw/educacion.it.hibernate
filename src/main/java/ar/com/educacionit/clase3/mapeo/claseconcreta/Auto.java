package ar.com.educacionit.clase3.mapeo.claseconcreta;

import jakarta.persistence.Entity;

@Entity
public class Auto extends Vehiculo {

	private int cantidadPuertas;
	
	public Auto() {
		super();
	}
	
	public Auto(int cantidadPuertas) {
		super();
		this.cantidadPuertas = cantidadPuertas;
	}
	
	public int getCantidadPuertas() {
		return cantidadPuertas;
	}
	
	public void setCantidadPuertas(int cantidadPuertas) {
		this.cantidadPuertas = cantidadPuertas;
	}
}
