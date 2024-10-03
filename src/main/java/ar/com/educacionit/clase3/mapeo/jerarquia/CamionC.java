package ar.com.educacionit.clase3.mapeo.jerarquia;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CAMIONC")
public class CamionC extends VehiculoC {

	private double capacidadDeCarga;

	public CamionC() {
	}

	public CamionC(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}

	public double getCapacidadDeCarga() {
		return capacidadDeCarga;
	}

	public void setCapacidadDeCarga(double capacidadDeCarga) {
		this.capacidadDeCarga = capacidadDeCarga;
	}
}
