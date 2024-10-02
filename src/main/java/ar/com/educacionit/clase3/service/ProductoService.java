package ar.com.educacionit.clase3.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.educacionit.clase3.model.Producto;
import ar.com.educacionit.clase3.repository.ProductoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Crear o guardar un producto
    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    // Obtener todos los productos
    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }

    // Obtener producto por ID
    public Optional<Producto> obtenerProductoPorId(Integer id) {
        return productoRepository.findById(id);
    }

    // Actualizar un producto
    public Producto actualizarProducto(Integer id, Producto productoDetalles) {
        Producto producto = productoRepository.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado"));
        producto.setNombre(productoDetalles.getNombre());
        producto.setPrecio(productoDetalles.getPrecio());
        producto.setFechaAlta(productoDetalles.getFechaAlta());
        producto.setStock(productoDetalles.getStock());
        return productoRepository.save(producto);
    }

    // Eliminar un producto
    public void eliminarProducto(Integer id) {
        productoRepository.deleteById(id);
    }
    
	public List<Producto> obtenerProductosConStockMenorA(Integer stock) {
		return productoRepository.findByStockLessThan(stock);
	}
}
