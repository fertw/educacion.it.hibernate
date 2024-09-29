package ar.com.educacionit.clase1;



import java.util.Date;

import ar.com.educacionit.clase1.dao.ClienteDAO;
import ar.com.educacionit.clase1.dao.ProductoDAO;
import ar.com.educacionit.clase1.model.Cliente;
import ar.com.educacionit.clase1.model.Producto;

public class Main {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
       
        
       Cliente cliente = new Cliente();
       cliente.setNombre("Fernando");
       cliente.setApellido("Alvarez");
       cliente.setEmail("falvares@gmail.com");
       cliente.setTelefono("1234567890");       
       clienteDAO.guardarCliente(cliente);
        
       

        Producto producto1 = new Producto();
        producto1.setNombre("tv");
        producto1.setPrecio(1200.00);
        producto1.setFechaAlta(new Date());
        producto1.setStock(10);
        
        Producto producto2 = new Producto();
        producto1.setNombre("teclado");
        producto1.setPrecio(1200.00);
        producto1.setFechaAlta(new Date());
        producto1.setStock(10);
        
        
        cliente.agregarProducto(producto1);
        cliente.agregarProducto(producto2);
        
        clienteDAO.guardarCliente(cliente);

        System.out.println("Producto guardado con éxito");
    }
}
