package ar.com.educacionit.clase3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.educacionit.clase3.model.Producto;
import ar.com.educacionit.clase3.service.ProductoService;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {

	@Autowired
	private ProductoService productoService;
	
	@GetMapping("/sinstock")
	public List<Producto> obtenerTodosLosProductosSinStock() {
		return productoService.buscarProductosSinStock();
	}
	
	@PostMapping
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoService.guardarProducto(producto);
	}
	
}
