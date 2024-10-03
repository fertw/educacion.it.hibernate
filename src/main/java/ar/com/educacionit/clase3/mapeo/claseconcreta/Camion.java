package ar.com.educacionit.clase3.mapeo.claseconcreta;

import jakarta.persistence.Entity;

@Entity
public class Camion extends Vehiculo {

	private double capacidadDeCarga;
	
	public Camion() {
		super();
	}
	
	public Camion(double capacidadDeCarga) {
		super();
		this.capacidadDeCarga = capacidadDeCarga;
	}
	
	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}
	
	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}
}
