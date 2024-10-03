package ar.com.educacionit.clase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.clase3.mapeo.claseconcreta.Auto;
import ar.com.educacionit.clase3.mapeo.claseconcreta.Camion;
import ar.com.educacionit.clase3.mapeo.claseconcreta.Vehiculo;
import ar.com.educacionit.clase3.repository.VehiculoRepositorio;

@RestController
@RequestMapping("/mapeo/claseconcreta/vehiculos")
public class VehiculoControlador {
	
	@Autowired
	private VehiculoRepositorio vehiculoRepositorio;
	
	@PostMapping("/auto")
	public Vehiculo crearAuto(@RequestBody Auto auto) {
		return vehiculoRepositorio.save(auto);
	}
	
	@PostMapping("/camion")
	public Vehiculo crearCamion(@RequestBody Camion camion) {
		return vehiculoRepositorio.save(camion);
	}

}
