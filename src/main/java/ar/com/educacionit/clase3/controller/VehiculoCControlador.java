package ar.com.educacionit.clase3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.clase3.mapeo.jerarquia.AutoC;
import ar.com.educacionit.clase3.mapeo.jerarquia.CamionC;
import ar.com.educacionit.clase3.mapeo.jerarquia.VehiculoC;
import ar.com.educacionit.clase3.repository.VehiculoCRepositorio;

@RestController
@RequestMapping("/mapeo/jerarquia/vehiculosC")
public class VehiculoCControlador {

	@Autowired
	private VehiculoCRepositorio vehiculoCRepositorio;

	@PostMapping("/auto")
	public VehiculoC crearAuto(@RequestBody AutoC auto) {
		return vehiculoCRepositorio.save(auto);
	}
	
	@PostMapping("/camion")
	public VehiculoC crearCamion(@RequestBody CamionC camion) {
		return vehiculoCRepositorio.save(camion);
	}

}
