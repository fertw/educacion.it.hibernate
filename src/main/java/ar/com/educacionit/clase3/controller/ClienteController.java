package ar.com.educacionit.clase3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.clase3.model.Cliente;
import ar.com.educacionit.clase3.service.ClienteService;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	// Crear un nuevo cliente
	@PostMapping
	public Cliente crearCliente(@RequestBody Cliente cliente) {
		return clienteService.guardarCliente(cliente);
	}

	// metodo para traer un cliente por su nombre
	@GetMapping("/{nombre}")
	public List<Cliente> buscarClientePorNombre(@PathVariable String nombre) {
		return clienteService.buscarClientePorNombre(nombre);
	}

}
