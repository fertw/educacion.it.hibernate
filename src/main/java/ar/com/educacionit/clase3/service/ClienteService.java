package ar.com.educacionit.clase3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.educacionit.clase3.model.Cliente;
import ar.com.educacionit.clase3.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	public Cliente guardarCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	// Obtener todos los clientes
    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    // Obtener cliente por ID
    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    // Actualizar un cliente
    public Cliente actualizarCliente(Long id, Cliente clienteDetalles) {
        Cliente cliente = clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente no encontrado"));
        cliente.setNombre(clienteDetalles.getNombre());
        cliente.setApellido(clienteDetalles.getApellido());
        cliente.setEmail(clienteDetalles.getEmail());
        cliente.setTelefono(clienteDetalles.getTelefono());
        return clienteRepository.save(cliente);
    }

    // Eliminar un cliente
    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
