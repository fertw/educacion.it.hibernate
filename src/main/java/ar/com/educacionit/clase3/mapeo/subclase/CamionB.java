package ar.com.educacionit.clase3.mapeo.subclase;

import jakarta.persistence.Entity;

@Entity
public class CamionB extends VehiculoB {

	private double capacidadDeCarga;
	
	public CamionB() {
	}
	
	public CamionB(String fabricante, double capacidadDeCarga) {
		super(fabricante);
		this.capacidadDeCarga = capacidadDeCarga;
	}
	
	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}
	
	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}
}
