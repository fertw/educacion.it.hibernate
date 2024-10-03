package ar.com.educacionit.clase3.mapeo.jerarquia;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("AUTOC")
public class AutoC extends VehiculoC {
	
	
	private int cantidadDePuertas;
	
	public AutoC() {
	}
	
	public AutoC(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}
	
	public int getCantidadDePuertas() {
		return cantidadDePuertas;
	}
	
	public void setCantidadDePuertas(int cantidadDePuertas) {
		this.cantidadDePuertas = cantidadDePuertas;
	}

}
