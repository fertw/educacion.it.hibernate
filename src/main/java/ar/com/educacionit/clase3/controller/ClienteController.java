package ar.com.educacionit.clase3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.clase3.model.Cliente;
import ar.com.educacionit.clase3.service.ClienteService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;

	// Crear un nuevo cliente
	@PostMapping
	public ResponseEntity<?> crearCliente(@Valid @RequestBody Cliente cliente, BindingResult bindingResult) {
		
		if (bindingResult.hasErrors()) {
	        List<String> errores = new ArrayList<>();
			for (FieldError error : bindingResult.getFieldErrors()) {
				errores.add("El campo " + error.getField() + " " + error.getDefaultMessage());
			}
			return ResponseEntity.badRequest().body(errores);
		  
		}
		Cliente clienteGuardado = clienteService.guardarCliente(cliente);
		return ResponseEntity.ok(clienteGuardado);
		
	}

	// metodo para traer un cliente por su nombre
	@GetMapping("/{nombre}")
	public List<Cliente> buscarClientePorNombre(@PathVariable String nombre) {
		return clienteService.buscarClientePorNombre(nombre);
	}

}
