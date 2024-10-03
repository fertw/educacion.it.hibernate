package ar.com.educacionit.clase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.clase3.mapeo.subclase.AutoB;
import ar.com.educacionit.clase3.mapeo.subclase.CamionB;
import ar.com.educacionit.clase3.mapeo.subclase.VehiculoB;
import ar.com.educacionit.clase3.repository.VehiculoBRepositorio;

@RestController
@RequestMapping("/mapeo/subclase/vehiculosB")
public class VehiculoBControlador {

	@Autowired
	private VehiculoBRepositorio vehiculoBRepositorio;

	@PostMapping("/auto")
	public VehiculoB crearAuto(@RequestBody AutoB auto) {
		return vehiculoBRepositorio.save(auto);
	}
	
	@PostMapping("/camion")
	public VehiculoB crearCamion(@RequestBody CamionB camion) {
		return vehiculoBRepositorio.save(camion);
	}

}
